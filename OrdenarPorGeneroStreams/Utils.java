package OrdenarPorGeneroStreams;

import java.util.function.Consumer;


public class Utils {
    public final static Consumer<Pessoa> print() {
		return e -> System.out.print(e.getNome() + "\n");
	}

}
