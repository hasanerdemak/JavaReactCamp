package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), 
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), 
					gamer.getDateOfBirth().getYear());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}
}