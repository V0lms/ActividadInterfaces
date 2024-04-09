import java.util.*;

public class VehiculoCliente extends Vehiculo {

	public VehiculoCliente(){

	}
	public VehiculoCliente(int tiempo,Parkings parking){
		this.tiempo=0;
		this.parking=null;
	}

	public int factura(){
		if(tiempo==1440){
			return 25;
		}else if(tiempo>1440){
			tiempo=tiempo-1440;
			return (tiempo/60)*1.2+25;
		}else{
			return (tiempo/60)*1.2;
		}
	}

	public boolean hayPlaza(Parkings parking){
		//
	}

	public void aparca(Parkings parking){
		//
	}

	public void setTiempo(int tiempo){
		this.tiempo=tiempo;
	}


}
