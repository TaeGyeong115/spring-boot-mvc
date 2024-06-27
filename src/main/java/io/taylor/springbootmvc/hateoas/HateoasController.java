package io.taylor.springbootmvc.hateoas;

import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HateoasController {
    @GetMapping("/hateoas")
    public CollectionModel<Hateoas> hateoas() {
        Hateoas hateoas = new Hateoas();
        hateoas.setPrefix("Hey,");
        hateoas.setName("Taylor");

        CollectionModel<Hateoas> hateoasResource = CollectionModel.empty() ;
        hateoasResource.add(linkTo(methodOn(HateoasController.class).hateoas()).withSelfRel());
        return hateoasResource;
    }

}
