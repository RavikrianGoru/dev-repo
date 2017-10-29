package javatpoint.arithmetic;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		ArithmeticUtils.postIncDecOperations();
		ArithmeticUtils.preIncDecOperations();
		ArithmeticUtils.doUnaryOperations();
		ArithmeticUtils.negationTildOperations();
		
		ArithmeticUtils.doArithmeticOptns();
		
		ArithmeticUtils.doLeftShift();
		ArithmeticUtils.doRightShift();
		
		ArithmeticUtils.doLogical_BitwiseAND();
		ArithmeticUtils.doLogical_BitwiseOR();
		ArithmeticUtils.findMinTernaryOperation(20, 50);
		ArithmeticUtils.doAssignmentOptns();
	}
}
