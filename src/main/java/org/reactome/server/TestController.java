package org.reactome.server;

import org.reactome.server.graph.domain.model.DatabaseObject;
import org.reactome.server.graph.service.DatabaseObjectService;
import org.reactome.server.graph.service.DetailsService;
import org.reactome.server.graph.service.helper.ContentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    private final DetailsService detailsService;
    private final DatabaseObjectService databaseObjectService;

    @Autowired
    public TestController(DetailsService detailsService, DatabaseObjectService databaseObjectService) {
        this.detailsService = detailsService;
        this.databaseObjectService = databaseObjectService;
    }

    @GetMapping("/")
    public DatabaseObject test() {
        return databaseObjectService.findByIdNoRelations("R-HSA-539044");
//        ContentDetails contentDetails = detailsService.getContentDetails("R-HSA-539044", true);
//        return contentDetails;
    }
}
