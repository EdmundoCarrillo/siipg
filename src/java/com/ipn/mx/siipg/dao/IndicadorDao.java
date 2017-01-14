/*
 * This code was developed by Edmundo Carrillo on java technologies.
 * Contact: edmundodev@gmail.com
 * Hope you'll find it useful.
 */
package com.ipn.mx.siipg.dao;

import com.ipn.mx.siipg.dao.util.EjeHasIndicadorView;
import com.ipn.mx.siipg.modelo.Indicador;
import com.ipn.mx.siipg.modelo.Ejetematico;
import java.util.List;

/**
 *
 * @author Edmundo Carrillo
 */
public interface IndicadorDao {

    public List<EjeHasIndicadorView> loadIndicadores();

    public void newIndicador(Indicador indicador);

    public void updateIndicador(Indicador indicador);

    public void deleteIndicador(Indicador indicador);

    public List<Indicador> loadIndicadoresByEje(Ejetematico ejeTematico);

}
