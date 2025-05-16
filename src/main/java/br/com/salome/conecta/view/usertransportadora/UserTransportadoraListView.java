package br.com.salome.conecta.view.usertransportadora;

import br.com.salome.conecta.entity.UserTransportadora;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "user-transportadoras", layout = MainView.class)
@ViewController(id = "UserTransportadora.list")
@ViewDescriptor(path = "user-transportadora-list-view.xml")
@LookupComponent("userTransportadorasDataGrid")
@DialogMode(width = "64em")
public class UserTransportadoraListView extends StandardListView<UserTransportadora> {
}