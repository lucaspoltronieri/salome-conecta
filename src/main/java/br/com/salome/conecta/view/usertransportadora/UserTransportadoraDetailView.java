package br.com.salome.conecta.view.usertransportadora;

import br.com.salome.conecta.entity.UserTransportadora;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "user-transportadoras/:id", layout = MainView.class)
@ViewController(id = "UserTransportadora.detail")
@ViewDescriptor(path = "user-transportadora-detail-view.xml")
@EditedEntityContainer("userTransportadoraDc")
public class UserTransportadoraDetailView extends StandardDetailView<UserTransportadora> {
}