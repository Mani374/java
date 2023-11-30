package Example;
import java.util.ArrayList;
import java.util.List;
public class SortedPersons {
	public static void main(String[] args) {
 List<Integer> nums=new ArrayList<>();
 nums.add(1);
 nums.add(2);
 nums.add(3);
 nums.add(5);
 nums.add(6);
 nums.add(7);
 nums.add(8);
 nums.add(9);
 nums.add(10);
 System.out.println(nums);
 nums.stream().filter(n->n%2==1).map(n->n*2).forEach(n->System.out.println(n));
 
}}

