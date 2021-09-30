package generic;
//create a generic class Holder/BOx/Wrapper which can hold T type of reference
public class Holder<T> {
//state : T
	private T ref;//HAS-A

	public Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}
	
}
