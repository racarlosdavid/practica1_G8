/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session;

/**
 *
 * @author Pablo
 */
@Stateless
public class TipoTarjetaFacade  extends AbstractFacade<TipoTarjeta> 
        implements TipoTarjetaFacadeLocal {
    
    @PersistenceContext(unitName = "BD_PU")
     private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Resource
    private EJBContext ejbContext;

    public TipoTarjetaFacade() {
        super(TipoTarjeta.class);
    }

    @Override
    public void metodo1() {
        //LOGICA
    }

    @Override
    public String metodo2() {
        String mensaje = "";
        //LOGICA
        return mensaje;
    }

    @Override
    public int obtenerCodigo(TipoTarjeta tipotarjeta) {
        int codigo = 2.0;
        //LOGICA
        return codigo;
    }

    @Override
    public String obtenerNombre(TipoTarjeta tipotarjeta) {
        string nombre = "nombre";
        //LOGICA
        return nombre;
    }
    
    @Override
    public String obtenerDescripcion(TipoTarjeta tipotarjeta) {
        string descripcion = "descripcion";
        //LOGICA
        return descripcion;
    }

    @Override
    public TipoTarjeta cambiarTarjetas(TipoTarjeta rec1, TipoTarjeta rec2) {
         TipoTarjeta tarjeta = new TipoTarjeta();
        //LOGICA
        return tarjeta;
    }

    @Override
    public void insertar(TipoTarjeta tarjeta) throws Exception {
        UserTransaction userTransaction = ejbContext.getUserTransaction();
         userTransaction.begin();
        this.create(tarjeta);
        userTransaction.commit(); 
    }
}
