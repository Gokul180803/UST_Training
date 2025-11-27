package collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class collect {

	public static void main(String[] args) {
List<String> list =Arrays.asList("act","apple","axe","bat","ball");
				 List<String> res=list.stream()
						 .collect(new Collector<String, Set<String>, List<String>>(){

							@Override
							public Supplier<Set<String>> supplier() {
								// TODO Auto-generated method stub
								return HashSet::new;
							}

							@Override
							public BiConsumer<Set<String>, String> accumulator() {
								// TODO Auto-generated method stub
								return Set::add;
							}

							@Override
							public BinaryOperator<Set<String>> combiner() {
								// TODO Auto-generated method stub
								return (set1,set2)->{
									set1.addAll(set2);
									return set1;
								};
							}

							@Override
							public Function<Set<String>, List<String>> finisher() {
								// TODO Auto-generated method stub
								return ArrayList::new;
							}

							@Override
							public Set<Characteristics> characteristics() {
								// TODO Auto-generated method stub
								return null;
							}
							 
							 
							 
						 });
				 System.out.print(res);
				
	}
				 		
	

}
