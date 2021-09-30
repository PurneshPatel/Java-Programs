package tester;

import static com.app.core.AccountType.valueOf;
import static java.time.LocalDate.parse;
import static utils.AccountValidation.validateBalance;
import static utils.CollectionUtils.populateMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.AccountType;
import com.app.core.BankAccount;

import custom_exception.AccountHandlingException;

public class BankingApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map of sample data
			HashMap<Integer, BankAccount> acctMap = populateMap();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Create A/C 2. Display All Accounts 3.Get A/C summary"
						+ "4. Funds Transfer 5. Close A/C 6.Search by A/C Type 7. Sort a/cs by acct no100.Exit");

				try {
					switch (sc.nextInt()) {
					case 1: // create a/c : validation rule : no dup a/cs
						System.out.println(
								"Enter a/c details  acctNo,  customerName,  type,  balance,  creationDate(yyyy-MM-dd)");
						int acctNo = sc.nextInt();
						if (acctMap.containsKey(acctNo))
							throw new AccountHandlingException("Dup a/c no!!!!!");
						// new a/c no
						acctMap.put(acctNo, new BankAccount(acctNo, sc.next(), valueOf(sc.next().toUpperCase()),
								validateBalance(sc.nextDouble()), parse(sc.next())));
						System.out.println("A/c created...");
						break;
					case 2:
						System.out.println("All A/c Details");
						// can u attach an iterator / for-each / for to the map ? NO
						// convert Map ---> Collection (keySet / values /entrySet)
						for (BankAccount a : acctMap.values())
							System.out.println(a);

						break;
					case 3: // get a/c summary : i/p acct no
						System.out.println("Enter acct no to get a/c details");
						BankAccount a = acctMap.get(sc.nextInt());// auto boxing (int ---> Integer)
						if (a == null)
							throw new AccountHandlingException("Invalid acct no!!!!!");
						System.out.println("A/C Summary " + a);
						break;

					case 4: // transfer funds i/p : src acct no , dest acct no amount
						System.out.println("Enter src a/c no , dest a/c no amount");
						int srcNo = sc.nextInt();
						int destNo = sc.nextInt();
						double amount = sc.nextDouble();
						// get src acct details from src a/c no (validate if src a/c exists)
						BankAccount src = acctMap.get(srcNo);
						if (src == null)
							throw new AccountHandlingException("Invalid src acct no!!!!!");
						BankAccount dest = acctMap.get(destNo);
						if (dest == null)
							throw new AccountHandlingException("Invalid dest acct no!!!!!");
						// a/cs exists
						src.transferFunds(dest, amount);
						System.out.println("funds transferred...");
						break;
					case 5:
						System.out.println("Enter acct no");
						a = acctMap.remove(sc.nextInt());
						if (a == null)
							throw new AccountHandlingException("Can't close A/C : invalid acct no!!!!!!");
						System.out.println("Closed A/C " + a);
						break;

					case 6:
						System.out.println("Enter a/c type to fetch a/c balance");
						AccountType type = valueOf(sc.next().toUpperCase());
						System.out.println("Printing balance of all " + type + " type of a/cs");
						for (BankAccount a1 : acctMap.values())
							if (a1.getType().equals(type))
								System.out.println(a1.getBalance());
						break;
					case 7:
						// sorted map : TreeMap(Map<? extends K,? extends V> map)
						TreeMap<Integer, BankAccount> sortedMap = new TreeMap<>(acctMap);
						// JVM invokes Integer's compareTo
						System.out.println("Accts sorted as per a/c no ");
						for (BankAccount a1 : sortedMap.values())
							System.out.println(a1);
						break;
					case 8: // sort accts as per desc order of acct nos n display them
						// Since sorting criteria is Key based : can be done using TreeMap
						// desc : custom ordering : Comparator
						// TreeMap(Comparator<? super K> comp)
						TreeMap<Integer, BankAccount> acctsByDescAcctNo = new TreeMap<>(new Comparator<Integer>() {
							@Override
							public int compare(Integer acctNo1, Integer acctNo2) {
								System.out.println("in compare : desc acct no");
								return acctNo2.compareTo(acctNo1);
							}
						});
						System.out.println(acctsByDescAcctNo);//{} : empty treemap
						acctsByDescAcctNo.putAll(acctMap);//invokes interally : ano inner cls's compare method
						System.out.println("A/cs sorted as per desc acct nos");
						for(BankAccount a1 : acctsByDescAcctNo.values())
							System.out.println(a1);						
						break;
					case 9 : //sort accts as per acct creation date
						//Can you solve this using a TreeMap : NO (since it's creationDate : value based criteria)
						//Map ---> Collection<V>
						Collection<BankAccount> acctCollection=acctMap.values();
						//Collections.sort(List<T> list,Comparator<? super T> comp)
						//Collection<V> ---> List(AL/LL/Vector)
						ArrayList<BankAccount> list=new ArrayList<>(acctCollection);
						Collections.sort(list, new Comparator<BankAccount>() {

							@Override
							public int compare(BankAccount o1, BankAccount o2) {
								// TODO Auto-generated method stub
								return o1.getCreationDate().compareTo(o2.getCreationDate());
							}
							
						});
						for(BankAccount a1 : list)
							System.out.println(a1);
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// System.out.println(e.getMessage());
				}
				// clear the buffere of a scanner till new line
				sc.nextLine();
			}
		}

	}

}
