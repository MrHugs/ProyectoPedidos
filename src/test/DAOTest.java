//package test;
//
//import static org.junit.Assert.assertTrue;
//
//import java.io.File;
//import java.util.ArrayList;
//
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//import modelo.DAO;
//import modelo.Persona;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class DAOTest {
//	private static final boolean UNICO = true;
//	private static final String PRUEBALISTA_TST = "pruebalista.tst";
//	private static final String PRUEBAO_TST = "pruebaObj.tst";
//	private static final boolean UNICOO = false;
//	DAO instancia = new DAO();
//	ArrayList lista = new ArrayList();
//
//	@Before
//	public void setUp() throws Exception {
//		lista.add(new Persona("1", "A"));
//		lista.add(new Persona("2", "B"));
//		lista.add(new Persona("3", "C"));
//		lista.add(new Persona("4", "D"));
//		lista.add(new Persona("5", "E"));
//	}
//
//	@Test
//	public void test01Grabar() {
//		assertTrue(instancia.grabar(lista, PRUEBALISTA_TST, UNICO));
//	}
//
//	@Test
//	public void test02Leer() {
//		ArrayList listaActual = (ArrayList) instancia.leer(PRUEBALISTA_TST, UNICO);
//		// delegar la responsabilidad de la compararcion en el propio objeto que
//		// compara
//		boolean iguales = true;
//		for (int i = 0; i < listaActual.size() && iguales; i++) {
//			iguales = lista.get(i).equals(listaActual.get(i));
//		}
//		// como no hay un assert para lista delego la compararcion en los
//		// elementos de la
//		// lista. concretamente en su metodo equals
//		assertTrue(iguales);
//	}
//
//	@Test
//	public void test03GrabarO() {
//		//es mejor borrar el archivo para cada prueba
//		new File(PRUEBAO_TST).delete();
//		assertTrue(instancia.grabar(new Persona("1", "F"), PRUEBAO_TST, UNICOO));
//		assertTrue(instancia.grabar(new Persona("2", "G"), PRUEBAO_TST, UNICOO));
//	}
//
//	@Test
//	public void test04LeerO() {
//		//primer objeto
//		assertTrue(instancia.leer(PRUEBAO_TST, UNICOO).equals(new Persona("1", "")));
//		//segundo Objeto
//		assertTrue(instancia.leer(PRUEBAO_TST, UNICOO).equals(new Persona("2", "")));		
//	}
//
//}
