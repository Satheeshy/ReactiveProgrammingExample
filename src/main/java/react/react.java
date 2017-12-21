package react;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;

public class react {
	
	public static void main(String []args) {
	
		List<String> words = Arrays.asList("the",
				 "quick",
				 "brown",
				 "fox",
				 "jumped",
				 "over",
				 "the",
				 "lazy",
				 "dog");
		
//		Observable<List<String>> w = Observable.just(words);
//		
//		w.subscribe(System.out::println);
		
		Disposable d =  Observable.fromIterable(words)
		.subscribe(System.out::println,e->e.printStackTrace());
		System.out.println("hai");
		d.dispose();

	}

}
