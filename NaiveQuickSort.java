package assignment08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NaiveQuickSort implements Sorter {

	/**
	 * Return a list of all the elements that are less than list.get(0)
	 * according to the compareTo of E, i.e. all elements e in list such
	 * that e.compareTo(get(0)) < 0.
	 * @param list the input list from which the elements that are less than are taken
	 * @return a list of all the elements that are less than list.get(0)
	 * according to the compareTo of E 
	 */


	private static <E extends Comparable<? super E>> List<E> less(List<E> list) {
		List<E> updatedList = new ArrayList<>();
		if(list.size()>1){
			for(int i =1; i<list.size();i++){
				if(list.get(i).compareTo(list.get(0))<0){
					updatedList.add(list.get(i));
				}
			}  
		}
		return updatedList;


	}

	/**
	 * Return a list of all the elements that are greater than or equal to list.get(0)
	 * according to the compareTo of E, i.e. all elements e in list such
	 * that e.compareTo(get(0)) >= 0. 
	 * @param list the input list from which the elements that are not less than are taken
	 * @return a list of all the elements that are greater than or equal to list.get(0)
	 * according to the compareTo of E 
	 */
	private static <E extends Comparable<? super E>> List<E> gteq(List<E> list) {
		List<E> updatedList = new ArrayList<>();
		if(list.size()>1){
			for(int i = 1; i<list.size();i++){
				if(list.get(i).compareTo(list.get(0))>=0){
					updatedList.add(list.get(i));
				}
			}   
		}
		return updatedList;


	}



	/**
	 * Returns true or false according as the list is already sorted according to the
	 * compareTo of E.
	 * @param list a list to be checked for sorted order
	 * @return true if the list is already sorted, otherwise false
	 */
	private static <E extends Comparable<? super E>> boolean inOrder(List<E> list) {
		boolean retVal = true;
		if(list.size()>1){
			for(int i = 1; i< list.size();i++){
				if(list.get(i-1).compareTo(list.get(i))>0){
					retVal = false;
				}

			}
		}
		return retVal;
	}

	/**
	 * Return a sorted copy of the input list, using the compareTo of E
	 * to determine the order of the elements
	 * @param list the input list
	 * @return the same list elements in sorted order
	 */
	public static <E extends Comparable<? super E>> List<E> sort(List<E> list) {
		List<E> aList = list;
		if(!inOrder(list)){
			aList = sort(less(list));
			aList.add(list.get(0));
			aList.addAll(sort(gteq(list)));   
		}
		return aList;
	}
	@Override
	public <E extends Comparable<? super E>> double timedSort(List<E> list) {
		long start = System.currentTimeMillis();
		list = sort(list);
		long end = System.currentTimeMillis();
		return end - start;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> lst = new ArrayList<Integer>();

		for(int i = 0; i < 10; i++)
			lst.add(r.nextInt(1000));
		System.out.println(lst);
		System.out.println(sort(lst));

		System.out.println("-----------------------------");
		lst.clear();

		for(int i = 0; i < 10000; i++)
			lst.add(r.nextInt(1000));
		System.out.println(lst);
		System.out.println(sort(lst));
	}

}