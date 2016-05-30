package bf.gov.finances.dgsi.appbc.entites;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PaiementFacture.class)
public abstract class PaiementFacture_ {

	public static volatile SingularAttribute<PaiementFacture, Date> datePaiement;
	public static volatile SingularAttribute<PaiementFacture, String> codefacture;
	public static volatile SingularAttribute<PaiementFacture, Long> id;
	public static volatile SingularAttribute<PaiementFacture, String> codeClient;

}

