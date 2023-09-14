package bottlesOOP_VaryVerseRequirement;

public class BottleNumber1 extends BottleNumber{

	public BottleNumber1(int number) {
		super(number);
	}
	
    @Override
    public String container() {
    		return "bottle";
    }
    
    @Override
    public String pronoun() {
    		return "it";
    }
}
