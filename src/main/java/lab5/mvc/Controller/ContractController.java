package lab5.mvc.Controller;

import lab5.mvc.Entity.Contract;
import lab5.mvc.Service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/contracts")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @GetMapping("/")
    public String showAll(Model model){
        List<Contract> contracts = contractService.getAll();
        model.addAttribute("contracts", contracts);
        return "ContractsAll";
    }

    @GetMapping("/add")
    public String add(Model model){
        Contract contract = new Contract();
        model.addAttribute("contract", contract);
        return "contractAdd";
    }

    @GetMapping("/save")
    public String save(@ModelAttribute("contract") @Valid final Contract contract,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "contractAdd";
        }
        contractService.save(contract);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id,
                                 Model model){
        Contract contract = contractService.get(id);
        model.addAttribute("contract", contract);
        return "contractAdd";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        contractService.delete(id);
        return "redirect:/contracts/";
    }
}
