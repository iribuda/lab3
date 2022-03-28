package lab7.controller;

import lab7.Entity.Contract;
import lab7.Entity.Hotel;
import lab7.Entity.Program;
import lab7.Service.ContractService;
import lab7.Service.HotelService;
import lab7.Service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/sales")
public class SalesController {
    @Autowired
    private ProgramService programService;

    @GetMapping("/programs")
    public String showAllPrograms(Model model){
        List<Program> programs = programService.getAll();
        model.addAttribute("programs", programs);
        return "ProgramsAll";
    }

    @GetMapping("/programs/add")
    public String addProgram(Model model){
        Program program = new Program();
        model.addAttribute("program", program);
        return "programAdd";
    }

    @RequestMapping("/programs/save")
    public String saveProgram(@ModelAttribute("program") @Valid final Program program,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "programAdd";
        }
        programService.save(program);
        return "redirect:/";
    }

    @GetMapping("/programs/update")
    public String updateProgram(@RequestParam("id") int id,
                         Model model){
        Program program = programService.get(id);
        model.addAttribute("program", program);
        return "programAdd";
    }

    @GetMapping("/programs/delete")
    public String deleteProgram(@RequestParam("id") int id){
        programService.delete(id);
        return "redirect:/";
    }

    @Autowired
    private ContractService contractService;

    @GetMapping("/contracts")
    public String showAllContracts(Model model){
        List<Contract> contracts = contractService.getAll();
        model.addAttribute("contracts", contracts);
        return "ContractsAll";
    }

    @GetMapping("/contracts/add")
    public String addContract(Model model){
        Contract contract = new Contract();
        model.addAttribute("contract", contract);
        return "contractAdd";
    }

    @RequestMapping("/contracts/save")
    public String saveContract(@ModelAttribute("contract") @Valid final Contract contract,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "contractAdd";
        }
        contractService.save(contract);
        return "redirect:/";
    }

    @GetMapping("/contracts/update")
    public String updateContract(@RequestParam("id") int id,
                         Model model){
        Contract contract = contractService.get(id);
        model.addAttribute("contract", contract);
        return "contractAdd";
    }

    @GetMapping("/contracts/delete")
    public String deleteContract(@RequestParam("id") int id){
        contractService.delete(id);
        return "redirect:/";
    }
    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotels")
    public String showAllHotels(Model model){
        List<Hotel> hotels = hotelService.getAll();
        model.addAttribute("hotels", hotels);
        return "HotelsAll";
    }

    @GetMapping("/hotels/add")
    public String addHotel(Model model){
        Hotel hotel = new Hotel();
        model.addAttribute("hotel", hotel);
        return "hotelAdd";
    }

    @RequestMapping("/hotels/save")
    public String saveHotel(@ModelAttribute("hotel") @Valid final Hotel hotel,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "hotelAdd";
        }
        hotelService.save(hotel);
        return "redirect:/";
    }

    @GetMapping("/hotels/update")
    public String updateHotel(@RequestParam("id") int id,
                         Model model){
        Hotel hotel = hotelService.get(id);
        model.addAttribute("hotel", hotel);
        return "hotelAdd";
    }

    @GetMapping("/hotels/delete")
    public String deleteHotel(@RequestParam("id") int id){
        hotelService.delete(id);
        return "redirect:/";
    }
}
