package procesos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import generated.*;

/**
 * 
 * @author Manuel C.
 *
 */
public class Main {

	private static final String MIARCHIVO_XML = "./micentro.xml";
	
public static void main(String[] args) {
		
		ObjectFactory objectfactory = new ObjectFactory();
		
		TipoProfesor prof1 = new TipoProfesor();
		prof1.setCodigoprofesor("E005TX");
		prof1.setNombreprofesor("Julian Lopez");
				
		TipoProfesor prof2= new TipoProfesor();
		prof2.setCodigoprofesor("E235TX");
		prof2.setNombreprofesor("Lucia Jimenez");
				
		TipoProfesor prof3 = new TipoProfesor();
		prof3.setCodigoprofesor("E885TX");
		prof3.setNombreprofesor("Antonio Martin");
		
		TipoCentro centro = new TipoCentro();
		centro.setCodigocentro("AE345TYC");
		centro.setNombrecentro("Juan Ramon Jimenez");
		centro.setDireccion("Avenida Los rozales numero: 13, Malaga");
		centro.setDirector(prof3);
		
		TipoProfesores tprof = new TipoProfesores();
		tprof.getProfesor().add(prof1);
		tprof.getProfesor().add(prof2);
		tprof.getProfesor().add(prof3);
		
		TipoDatoscentro datoscentro = new TipoDatoscentro();
		datoscentro.setCentro(centro);
		datoscentro.setProfesores(tprof);
		
		
		JAXBElement<TipoDatoscentro> elemento = objectfactory.createDatoscentro(datoscentro);
		
		try {
			   JAXBContext contexto = JAXBContext.newInstance(ObjectFactory.class);
			   Marshaller m = contexto.createMarshaller();
			   m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			   m.marshal(elemento, new FileOutputStream(MIARCHIVO_XML));
			   String ruta ="./micentro.xml";
			   m.marshal(elemento, System.out);
	}catch(JAXBException jb) {
		
		jb.printStackTrace();
		
	}catch(FileNotFoundException fnf){
		
		fnf.printStackTrace();
		
		}
		
	}
}

