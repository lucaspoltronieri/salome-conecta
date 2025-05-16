package br.com.salome.conecta.view.usercliente;

import br.com.salome.conecta.entity.UserCliente;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "user-clientes/:id", layout = MainView.class)
@ViewController(id = "UserCliente.detail")
@ViewDescriptor(path = "user-cliente-detail-view.xml")
@EditedEntityContainer("userClienteDc")
public class UserClienteDetailView extends StandardDetailView<UserCliente> {
}