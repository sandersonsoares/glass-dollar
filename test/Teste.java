
import br.com.glassdolar.auxiliar.ActiveOption;
import br.com.glassdolar.auxiliar.TagFundraisingImpression;
import br.com.glassdolar.auxiliar.TagNegativeInvestment;
import br.com.glassdolar.auxiliar.TagPositiveInvestment;
import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Founder;
import br.com.glassdolar.model.Invester;
import br.com.glassdolar.model.Review;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Girlian Santos
 */
public class Teste {
    public static void main(String[] args){
        Facade facade = new Facade();
        
        Invester i = facade.getAllInvestors().get(0);
        System.out.println(i.getOverallRating()+ " - RATING DO INVESTIDOR");
        System.out.println(i.indicateToAFriend()+ "% - INDICARIAM AOS AMIGOS");
        System.out.println(i.fundraisingImpression() +" - FUNDRAISING IMPRESSION");
        System.out.println(i.investimesCriteria()+" - INVESTMENT CRITERIA");
        System.out.println(i.positiveInvestment()+" - POSITIVE INVESTMENT");
        /*Invester i = facade.getAllInvestors().get(0);
        
        Review r1 = new Review();
        r1.setIndicateFriend(true);
        r1.setInvestOffer(true);
        r1.setOverallRating(3.0);
        r1.setInvestimentoAceito(true);
        r1.setTagPositive(TagPositiveInvestment.SUPPORT);
        r1.setTagImpression(TagFundraisingImpression.PREPARED);
        
        Review r2 = new Review();
        r2.setIndicateFriend(true);
        r2.setInvestOffer(true);
        r2.setOverallRating(5.0);
        r2.setInvestimentoAceito(true);
        r2.setTagPositive(TagPositiveInvestment.TRUS);
        r2.setTagImpression(TagFundraisingImpression.PREPARED);
        
        Review r3 = new Review();
        r3.setIndicateFriend(false);
        r3.setInvestOffer(true);
        r3.setOverallRating(1.0);
        r3.setInvestimentoAceito(false);
        r3.setTagNegative(TagNegativeInvestment.DRAG);
        r3.setTagImpression(TagFundraisingImpression.NEVER_HEARD_BACK);
        
        i.getReviews().add(r1);
        i.getReviews().add(r2);
        i.getReviews().add(r3);
        
        facade.saveInvester(i);*/
}
}