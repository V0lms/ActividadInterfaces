
import java.util.*;

public interface Vehiculo {
	int tiempo=0;

	public int factura();

	public boolean hayPlaza(Parkings parking);

	public void aparca(Parkings parking);

	public void setTiempo(int tiempo);


}
