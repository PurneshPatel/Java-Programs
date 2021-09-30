package non_generic;
//create a class Holder/BOx/Wrapper which can hold ANY type of data.
public class Holder {
//state : Object
	private Object ref;//HAS-A

	public Holder(Object ref) {
		super();
		this.ref = ref;
	}

	public Object getRef() {
		return ref;
	}
	
}
