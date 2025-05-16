package br.com.salome.conecta.view.transportadora;

import br.com.salome.conecta.entity.Transportadora;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "transportadoras/:id", layout = MainView.class)
@ViewController(id = "Transportadora.detail")
@ViewDescriptor(path = "transportadora-detail-view.xml")
@EditedEntityContainer("transportadoraDc")
public class TransportadoraDetailView extends StandardDetailView<Transportadora> {
}