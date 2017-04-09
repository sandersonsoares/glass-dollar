
import br.com.glassdolar.auxiliar.ActiveOption;
import br.com.glassdolar.auxiliar.TagFundraisingImpression;
import br.com.glassdolar.auxiliar.TagInvestmentCriteria;
import br.com.glassdolar.auxiliar.TagInvestmentType;
import br.com.glassdolar.auxiliar.TagNegativeInvestment;
import br.com.glassdolar.auxiliar.TagPositiveInvestment;
import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Invester;
import br.com.glassdolar.model.Investment;
import br.com.glassdolar.model.Partner;
import br.com.glassdolar.model.Review;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Girlian Santos
 */
public class BackupBD {
    
    public static void main(String[] args){
        
        //CHANGE THE PERSISTANCE.XML FOR DROP AND CREATE
        //MUDE O PERSISTENCE.XML PARA ELIMINAR E CRIAR
        
        //CLEAN AND BUILD THE PROJECT
        //LIMPE E CONSTRUA O PROJETO
        
        //RUN THIS CLASS
        //RODE ESSA CLASSE
        
        Facade facade = new Facade();
        
        Invester inv1 = new Invester();
        inv1.setActiveOption(ActiveOption.ACTIVE);
        inv1.setAlterarSenhaProxAcesso(false);
        inv1.setCompanyUrl("http://codeline.com.org");
        inv1.setName("Codeline Projects");
        inv1.setLogin("invester1");
        inv1.setLogoUrl("src/imgs/inv1-perfil.png");
        inv1.setMediumTicketSize(3.0);
        inv1.setSenha("passwordinv1");
        inv1.setTicketSize(9.0);
        inv1.setWhyLogin("Just looking for a business oportunity");
        boolean valor = inv1.getAreas().add("Bio tech");
        inv1.getAreas().add("AI");
        inv1.getGeography().add("Europe");
        inv1.getGeography().add("América");
        inv1.getOffices().add("San Francisco");
        inv1.getOffices().add("Lozangeles");
        
        Invester inv2 = new Invester();
        inv2.setActiveOption(ActiveOption.HYPER_ACTIVE);
        inv2.setAlterarSenhaProxAcesso(false);
        inv2.setCompanyUrl("http://codeline.com.org");
        inv2.setName("HK-INCHTECH");
        inv2.setLogin("invester2");
        inv2.setLogoUrl("src/imgs/inv2-perfil.png");
        inv2.setMediumTicketSize(3.0);
        inv2.setSenha("passwordinv2");
        inv2.setTicketSize(9.0);
        inv2.setWhyLogin("I want hire an invester");
        inv2.getAreas().add("Bio tech");
        inv2.getAreas().add("AI");
        inv2.getGeography().add("Oceania");
        inv2.getGeography().add("Asia");
        inv2.getOffices().add("Hong Kong");
        inv2.getOffices().add("Amsterdã");
        
        Invester inv3 = new Invester();
        inv3.setActiveOption(ActiveOption.INACTIVE);
        inv3.setAlterarSenhaProxAcesso(false);
        inv3.setCompanyUrl("http://microsoft.com");
        inv3.setName("Microsoft ");
        inv3.setLogin("invester3");
        inv3.setLogoUrl("src/imgs/inv3-perfil.png");
        inv3.setMediumTicketSize(3.0);
        inv3.setSenha("passwordinv3");
        inv3.setTicketSize(9.0);
        inv3.setWhyLogin("I want hire an invester");
        inv3.getAreas().add("Bio tech");
        inv3.getAreas().add("AI");
        inv3.getGeography().add("Oceania");
        inv3.getGeography().add("Asia");
        inv3.getOffices().add("Hong Kong");
        inv3.getOffices().add("Amsterdã");
        
        Partner p1 = new Partner();
        p1.setInvester(inv1);
        p1.setName("Ronaldo fenômeno");
        p1.setPerfilUrl("src/ronaldo.com");
        p1.setTitle("Administer partner");
        
        Partner p2 = new Partner();
        p2.setInvester(inv1);
        p2.setName("Ashton Kutcher");
        p2.setPerfilUrl("kutcher.com");
        p2.setTitle("CEO");
        
        Partner p3 = new Partner();
        p3.setInvester(inv1);
        p3.setName("Peter parker");
        p3.setPerfilUrl("www.jjjamison.spider.com");
        p3.setTitle("Special Partner");
        
        Partner p4 = new Partner();
        p4.setInvester(inv1);
        p4.setName("Christi Dollarus");
        p4.setPerfilUrl("www.Christi.org");
        p4.setTitle("Adversting Partner");
        
        Partner p5 = new Partner();
        p5.setInvester(inv1);
        p5.setName("Will Schmitt");
        p5.setPerfilUrl("www.freshprince.com");
        p5.setTitle("Social partner");
        
        Partner p6 = new Partner();
        p6.setInvester(inv1);
        p6.setName("Bill Gates");
        p6.setPerfilUrl("microsoft.com");
        p6.setTitle("CEO");
        
        Partner p7 = new Partner();
        p7.setInvester(inv2);
        p7.setName("Ronaldo fenômeno");
        p7.setPerfilUrl("src/ronaldo.com");
        p7.setTitle("Administer partner");
        
        Partner p8 = new Partner();
        p8.setInvester(inv2);
        p8.setName("Ashton Kutcher");
        p8.setPerfilUrl("kutcher.com");
        p8.setTitle("CEO");
        
        Partner p9 = new Partner();
        p9.setInvester(inv2);
        p9.setName("Peter parker");
        p9.setPerfilUrl("www.jjjamison.spider.com");
        p9.setTitle("Special Partner");
        
        Partner p10 = new Partner();
        p10.setInvester(inv2);
        p10.setName("Christi Dollarus");
        p10.setPerfilUrl("www.Christi.org");
        p10.setTitle("Adversting Partner");
        
        Partner p11 = new Partner();
        p11.setInvester(inv2);
        p11.setName("Will Schmitt");
        p11.setPerfilUrl("www.freshprince.com");
        p11.setTitle("Social partner");
        
        Partner p12 = new Partner();
        p12.setInvester(inv1);
        p12.setName("Bill Gates");
        p12.setPerfilUrl("microsoft.com");
        p12.setTitle("CEO");
        
        Partner p13 = new Partner();
        p13.setInvester(inv3);
        p13.setName("Ronaldo fenômeno");
        p13.setPerfilUrl("src/ronaldo.com");
        p13.setTitle("Administer partner");
        
        Partner p14 = new Partner();
        p14.setInvester(inv3);
        p14.setName("Ashton Kutcher");
        p14.setPerfilUrl("kutcher.com");
        p14.setTitle("CEO");
        
        Partner p15 = new Partner();
        p15.setInvester(inv3);
        p15.setName("Peter parker");
        p15.setPerfilUrl("www.jjjamison.spider.com");
        p15.setTitle("Special Partner");
        
        Partner p16 = new Partner();
        p16.setInvester(inv3);
        p16.setName("Christi Dollarus");
        p16.setPerfilUrl("www.Christi.org");
        p16.setTitle("Adversting Partner");
        
        Partner p17 = new Partner();
        p17.setInvester(inv3);
        p17.setName("Will Schmitt");
        p17.setPerfilUrl("www.freshprince.com");
        p17.setTitle("Social partner");
        
        Partner p18 = new Partner();
        p18.setInvester(inv3);
        p18.setName("Bill Gates");
        p18.setPerfilUrl("microsoft.com");
        p18.setTitle("CEO");
   
        inv1.getPartners().add(p1);
        inv1.getPartners().add(p2);
        inv1.getPartners().add(p3);
        inv1.getPartners().add(p4);
        inv1.getPartners().add(p5);
        inv1.getPartners().add(p6);
        
        inv2.getPartners().add(p7);
        inv2.getPartners().add(p8);
        inv2.getPartners().add(p9);
        inv2.getPartners().add(p10);
        inv2.getPartners().add(p11);
        inv2.getPartners().add(p12);
        
        inv3.getPartners().add(p13);
        inv3.getPartners().add(p14);
        inv3.getPartners().add(p15);
        inv3.getPartners().add(p16);
        inv3.getPartners().add(p17);
        inv3.getPartners().add(p18);
        
        Investment i1 = new Investment();
        i1.setArea("Bio Tech");
        i1.setDat(Calendar.getInstance());
        i1.setVal(4.5);
        
        Investment i2 = new Investment();
        i2.setArea("AI");
        i2.setDat(Calendar.getInstance());
        i2.setVal(9.0);
        
        Investment i3 = new Investment();
        i3.setArea("Marketing");
        i3.setDat(Calendar.getInstance());
        i3.setVal(3.0);
        
        Investment i4 = new Investment();
        i4.setArea("Marketing");
        i4.setDat(Calendar.getInstance());
        i4.setVal(3.0);
        
        Investment i5 = new Investment();
        i5.setArea("Marketing");
        i5.setDat(Calendar.getInstance());
        i5.setVal(3.0);
        
        Investment i6 = new Investment();
        i6.setArea("Marketing");
        i6.setDat(Calendar.getInstance());
        i6.setVal(3.0);
        
        Investment i7 = new Investment();
        i7.setArea("Marketing");
        i7.setDat(Calendar.getInstance());
        i7.setVal(3.0);
        
        Investment i8 = new Investment();
        i8.setArea("Marketing");
        i8.setDat(Calendar.getInstance());
        i8.setVal(3.0);
        
        Investment i9 = new Investment();
        i9.setArea("Marketing");
        i9.setDat(Calendar.getInstance());
        i9.setVal(3.0);
        
        inv1.getInvestments().add(i1);
        inv1.getInvestments().add(i2);
        inv1.getInvestments().add(i3);
        
        inv2.getInvestments().add(i4);
        inv2.getInvestments().add(i5);
        inv2.getInvestments().add(i6);
        
        inv3.getInvestments().add(i7);
        inv3.getInvestments().add(i8);
        inv3.getInvestments().add(i9);
        
        Review r1 = new Review();
        r1.setIndicateFriend(false);
        r1.setInvestOffer(true);
        r1.setInvestimentoAceito(false);
        r1.setOverallRating(5.0);
        r1.setTagNegative(TagNegativeInvestment.HIGH_VAL);
        r1.setTagInvestmentType(TagInvestmentType.MAJORITY);
        r1.setDescription("Simple case of no valid offers");
        
        Review r2 = new Review();
        r2.setIndicateFriend(false);
        r2.setInvestOffer(true);
        r2.setInvestimentoAceito(true);
        r2.setOverallRating(4.0);
        r2.setTagPositive(TagPositiveInvestment.TRUS);
        r2.setIndicateFriend(true);
        r2.setDescription("Just Amazing!!! I recomend this invester");
        
        Review r3 = new Review();
        r3.setIndicateFriend(false);
        r3.setInvestOffer(false);
        r3.setInvestimentoAceito(false);
        r3.setOverallRating(4.0);
        r3.setTagCriteria(TagInvestmentCriteria.BIG_VISION);
        r3.setTagImpression(TagFundraisingImpression.ONTIME);
        r3.setShortResponse(false);
        r3.setDescription("Wrong in all cases");
        
        Review r4 = new Review();
        r4.setIndicateFriend(false);
        r4.setInvestOffer(false);
        r4.setInvestimentoAceito(false);
        r4.setOverallRating(5.0);
        r4.setTagCriteria(TagInvestmentCriteria.BIG_VISION);
        r4.setTagImpression(TagFundraisingImpression.ONTIME);
        r4.setDescription("Simple case of no valid offers");
        
        Review r5 = new Review();
        r5.setIndicateFriend(true);
        r5.setInvestOffer(true);
        r5.setInvestimentoAceito(true);
        r5.setOverallRating(5.0);
        r5.setTagPositive(TagPositiveInvestment.TRUS);
        r5.setDescription("Just the best invester");
        
        Review r6 = new Review();
        r6.setIndicateFriend(false);
        r6.setInvestOffer(true);
        r6.setInvestimentoAceito(false);
        r6.setOverallRating(5.0);
        r6.setTagNegative(TagNegativeInvestment.HIGH_VAL);
        r6.setTagInvestmentType(TagInvestmentType.MAJORITY);
        r6.setDescription("Simple case of no valid offers");
        
        Review r7 = new Review();
        r7.setIndicateFriend(false);
        r7.setInvestOffer(true);
        r7.setInvestimentoAceito(true);
        r7.setOverallRating(4.0);
        r7.setTagPositive(TagPositiveInvestment.TRUS);
        r7.setIndicateFriend(true);
        r7.setDescription("Just Amazing!!! I recomend this invester");
        
        Review r8 = new Review();
        r8.setIndicateFriend(false);
        r8.setInvestOffer(false);
        r8.setInvestimentoAceito(false);
        r8.setOverallRating(4.0);
        r8.setTagCriteria(TagInvestmentCriteria.BIG_VISION);
        r8.setTagImpression(TagFundraisingImpression.ONTIME);
        r8.setShortResponse(false);
        r8.setDescription("Wrong in all cases");
        
        Review r9 = new Review();
        r9.setIndicateFriend(false);
        r9.setInvestOffer(false);
        r9.setInvestimentoAceito(false);
        r9.setOverallRating(5.0);
        r9.setTagCriteria(TagInvestmentCriteria.BIG_VISION);
        r9.setTagImpression(TagFundraisingImpression.ONTIME);
        r9.setDescription("Simple case of no valid offers");
        
        Review r10 = new Review();
        r10.setIndicateFriend(true);
        r10.setInvestOffer(true);
        r10.setInvestimentoAceito(true);
        r10.setOverallRating(5.0);
        r10.setTagPositive(TagPositiveInvestment.TRUS);
        r10.setDescription("Just the best invester");
        
        Review r11 = new Review();
        r11.setIndicateFriend(false);
        r11.setInvestOffer(true);
        r11.setInvestimentoAceito(false);
        r11.setOverallRating(5.0);
        r11.setTagNegative(TagNegativeInvestment.HIGH_VAL);
        r11.setTagInvestmentType(TagInvestmentType.MAJORITY);
        r11.setDescription("Simple case of no valid offers");
        
        Review r12 = new Review();
        r12.setIndicateFriend(false);
        r12.setInvestOffer(true);
        r12.setInvestimentoAceito(true);
        r12.setOverallRating(4.0);
        r12.setTagPositive(TagPositiveInvestment.TRUS);
        r12.setIndicateFriend(true);
        r12.setDescription("Just Amazing!!! I recomend this invester");
        
        Review r13 = new Review();
        r13.setIndicateFriend(false);
        r13.setInvestOffer(false);
        r13.setInvestimentoAceito(false);
        r13.setOverallRating(4.0);
        r13.setTagCriteria(TagInvestmentCriteria.BIG_VISION);
        r13.setTagImpression(TagFundraisingImpression.ONTIME);
        r13.setShortResponse(false);
        r13.setDescription("Wrong in all cases");
        
        Review r14 = new Review();
        r14.setIndicateFriend(false);
        r14.setInvestOffer(false);
        r14.setInvestimentoAceito(false);
        r14.setOverallRating(5.0);
        r14.setTagCriteria(TagInvestmentCriteria.BIG_VISION);
        r14.setTagImpression(TagFundraisingImpression.ONTIME);
        r14.setDescription("Simple case of no valid offers");
        
        Review r15 = new Review();
        r15.setIndicateFriend(true);
        r15.setInvestOffer(true);
        r15.setInvestimentoAceito(true);
        r15.setOverallRating(5.0);
        r15.setTagPositive(TagPositiveInvestment.TRUS);
        r15.setDescription("Just the best invester");
        
        inv1.getReviews().add(r1);
        inv1.getReviews().add(r2);
        inv1.getReviews().add(r3);
        inv1.getReviews().add(r4);
        inv1.getReviews().add(r5);
        
        inv2.getReviews().add(r6);
        inv2.getReviews().add(r7);
        inv2.getReviews().add(r8);
        inv2.getReviews().add(r9);
        inv2.getReviews().add(r10);
        
        
        inv3.getReviews().add(r11);
        inv3.getReviews().add(r12);
        inv3.getReviews().add(r13);
        inv3.getReviews().add(r14);
        inv3.getReviews().add(r15);
        
        facade.saveInvester(inv1);
        facade.saveInvester(inv2);
        facade.saveInvester(inv3);
    }
    
}
