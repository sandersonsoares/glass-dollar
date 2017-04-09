
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
        
        Invester i = new Invester();
        i.setCompanyUrl("codeline.com.br");
        i.setActiveOption(ActiveOption.ACTIVE);
        i.setLogin("m123");
        i.setSenha("senha");
        i.setLogoUrl("http://aslaskjdfhkajs");
        
        facade.saveInvester(i);
}
}