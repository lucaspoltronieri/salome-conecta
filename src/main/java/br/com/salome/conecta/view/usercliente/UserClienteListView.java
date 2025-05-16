package br.com.salome.conecta.view.usercliente;

import br.com.salome.conecta.entity.UserCliente;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "user-clientes", layout = MainView.class)
@ViewController(id = "UserCliente.list")
@ViewDescriptor(path = "user-cliente-list-view.xml")
@LookupComponent("userClientesDataGrid")
@DialogMode(width = "64em")
public class UserClienteListView extends StandardListView<UserCliente> {
}