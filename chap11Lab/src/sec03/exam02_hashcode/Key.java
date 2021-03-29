package sec03.exam02_hashcode;

public class Key {
	public int nember;

	public Key(int nember) {
		this.nember = nember;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return nember;

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.nember == compareKey.nember) {
				return true;
			}
		}
		return false;
	}

}
