package mascotaVirtual;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {
	
	@Test
	public void testCrearUsuario() {
		Usuario user = new Usuario();
		
		Assert.assertNotNull(user);
	}
	
	@Test
	public void testNameUser() {
		// Pasos para crear un test
        // 1) Definimos los datos necesarios para nuestra prueba

        // Objeto Creado
        Usuario user = new Usuario();

        // 2) Ejecutamos la prueba
        user.setNombre("Homero");

        // 3) Validamos que la prueba obtenga el resultado esperado
        Assert.assertEquals("Homero",user.getNombre());
	}
	
}
