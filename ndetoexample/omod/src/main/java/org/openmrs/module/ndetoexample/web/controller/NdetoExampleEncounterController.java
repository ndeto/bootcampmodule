package org.openmrs.module.ndetoexample.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Cohort;
import org.openmrs.Patient;
import org.openmrs.Encounter;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NdetoExampleEncounterController {


    protected final Log log = LogFactory.getLog(getClass());

    @RequestMapping(value = "/module/ndetoexample/encounter", method = RequestMethod.GET)


    public void manage(ModelMap model,@RequestParam(required = false, value="patientId") Integer ptId)
    {
        List<Encounter> encounters = Context.getEncounterService().getEncountersByPatient(Context.getPatientService().getPatient(ptId));
        model.addAttribute("all", encounters);


    }

    }

