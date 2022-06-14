package problems;

import solutions.Solution;

/**
 * The Evaluator interface gives to a problem the required functionality to
 * obtain a mapping of a solution (n-dimensional array of elements of generic
 * type E (domain)) to a Double (image). It is a useful representation of an
 * objective function for an optimization problem.
 * 
 * @author ccavellucci, fusberti
 * @param <E>
 */
public interface KQBF_Evaluator<E> extends Evaluator<E> {
    
	public abstract Double evaluateExchangeCost(E elemIn, E elemOut, Solution<E> sol);

    public abstract int getCurrentKnapsackWeight(Solution<E> sol);
	
	public abstract int getKnapsackWeightByItem(int i);

	public abstract int getKnapsackCapacity();

}
