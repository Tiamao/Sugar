package recipeserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import recipeserver.models.MeasureType;
import recipeserver.models.MeasureTypeDao;

/**
 * Created by Kamil on 02.06.2017.
 */
@Controller
public class MeasureTypeController {

    @Autowired
    private MeasureTypeDao measureTypeDao;

    @RequestMapping(value = "/measureType/{id}")
    @ResponseBody
    public MeasureType getMeasureType(@PathVariable int id) {
        return measureTypeDao.getMeasureType(id);
    }
}
