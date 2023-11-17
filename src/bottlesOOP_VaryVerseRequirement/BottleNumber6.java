package bottlesOOP_VaryVerseRequirement;

public class BottleNumber6 extends BottleNumber {
	
    public BottleNumber6(int number) {
		super(number);
    }

	@Override
    public String container() {
    		return "six-pack";
    }
    
    @Override
    public String quantity() {
    		return "1";
    }
}
