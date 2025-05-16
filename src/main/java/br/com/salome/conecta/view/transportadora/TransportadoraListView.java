package br.com.salome.conecta.view.transportadora;

import br.com.salome.conecta.entity.Transportadora;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "transportadoras", layout = MainView.class)
@ViewController(id = "Transportadora.list")
@ViewDescriptor(path = "transportadora-list-view.xml")
@LookupComponent("transportadorasDataGrid")
@DialogMode(width = "64em")
public class TransportadoraListView extends StandardListView<Transportadora> {
}