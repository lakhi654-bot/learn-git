import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamPractice {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,9,8,6,4,3,9);
		evenSquare(list);
//		list.stream().filter(s->((s%2)==0)).limit(3).map(s->s*s).forEach(System.out::println);
	}
public static void evenSquare(List<Integer> list) {
	int count =0;
	for(int i=0;i<list.size();i++) {
	if(list.get(i)%2==0) {
		if(count<3) {
		int k=list.get(i);
		k=k*k;
		count++;
		System.out.println(k);
		}
	}
	}
}
}
