
import br.com.glassdolar.auxiliar.ActiveOption;
import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Founder;
import br.com.glassdolar.model.Invester;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Girlian Santos
 */
public class Teste {
    public static void main(String[] args){
        Facade facade = new Facade();
        
        List<Invester> investers = facade.getAllInvestors();
        List<Invester> porNome = facade.getInvestorByName("Marcelo");
        List<Invester> porLocal = facade.getInvestorByLocal("Toronto");
        List<Invester> porArea = facade.getInvestorByArea("AI");
        
        for(Invester i: investers)
            System.out.println(i.getName());
        System.out.println("---------------------------------------");
        for(Invester i: porArea)
            System.out.println(i.getName());
        System.out.println("---------------------------------------");
        for(Invester i: porLocal)
            System.out.println(i.getName());
        System.out.println("---------------------------------------");
        for(Invester i: porNome)
            System.out.println(i.getName());
        System.out.println("---------------------------------------");
}
}
