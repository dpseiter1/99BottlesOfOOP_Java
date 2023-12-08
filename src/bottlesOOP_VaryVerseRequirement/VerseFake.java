package bottlesOOP_VaryVerseRequirement;

// gives a better idea of countdown song typical format
public class VerseFake implements VerseTemplate {
	@Override
	public String lyrics(int number) {
		return String.format("This is verse %d.\n", number);
	}

	@Override
	public void setNumber(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String lyrics() {
		// TODO Auto-generated method stub
		return null;
	}
}
