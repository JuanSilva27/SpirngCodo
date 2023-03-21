package mascotaVirtual;

import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {
	
	@Test
	public void testTamagotchiConNombre() {
		Tamagotchi mascota2= new Tamagotchi("Tama");
		
		Assert.assertEquals(mascota2.getNombre(), "Tama");
	};
	
	@Test
	public void testComerConEstadoHambrientoCambiarAContento (){
		Tamagotchi mascota = new Tamagotchi();
        mascota.setEstado("hambrienta");
        mascota.comer();
        Assert.assertEquals(mascota.getEstado(),"contenta");
	}
	
}
