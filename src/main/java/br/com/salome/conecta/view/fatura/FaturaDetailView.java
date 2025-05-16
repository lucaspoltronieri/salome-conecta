package br.com.salome.conecta.view.fatura;

import br.com.salome.conecta.entity.Fatura;
import br.com.salome.conecta.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "faturas/:id", layout = MainView.class)
@ViewController(id = "Fatura.detail")
@ViewDescriptor(path = "fatura-detail-view.xml")
@EditedEntityContainer("faturaDc")
public class FaturaDetailView extends StandardDetailView<Fatura> {
}