
import br.com.glassdolar.auxiliar.ActiveOption;
import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Founder;
import br.com.glassdolar.model.Invester;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Girlian Santos
 */
public class Teste {
    public static void main(String[] args){
        Facade facade = new Facade();
        
        Invester i = new Invester();
        i.setActiveOption(ActiveOption.ACTIVE);
        i.setCompanyUrl("http://codeline.com.br");
        i.setLogoUrl("http://minhalogo.com");
        i.setName("Thomas Turbando");
        facade.saveInvester(i);
}
}
