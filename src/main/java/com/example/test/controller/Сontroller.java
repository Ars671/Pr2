package com.example.test.controller;

import com.example.test.dao.*;
import com.example.test.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Сontroller {

    private EmployeeDAO _employeeDAO;
    private UserDAO _userDAO;
    private SupplierDAO _supplierDAO;
    private OrderDAO _orderDAO;
    private ProductDAO _productDAO;

    @Autowired
    public Сontroller(EmployeeDAO employeeDAO, UserDAO userDAO, SupplierDAO supplierDAO, OrderDAO orderDAO, ProductDAO productDAO){
        _employeeDAO = employeeDAO;
        _userDAO = userDAO;
        _supplierDAO = supplierDAO;
        _orderDAO = orderDAO;
        _productDAO = productDAO;
    }


    @GetMapping()
    public String main(Model model){
     model.addAttribute("people", _employeeDAO.index());
     return "main";
    }
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("people", _employeeDAO.index());
        return "index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("employee", _employeeDAO.show(id));
        return "show";
    }


    @GetMapping("/new")
    public String newEmployee(@ModelAttribute("employee") EmployeeModel employeeModel){
        // model.addAttribute("employee", new EmployeeModel());
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("employee") EmployeeModel employeeModel){
        _employeeDAO.save(employeeModel);
        return "redirect:/index";
    }


    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("employee",_employeeDAO.show(id));
        return "edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("employee") EmployeeModel employeeModel, @PathVariable("id") int id){
        _employeeDAO.update(id,employeeModel);
        return "redirect:/index";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        _employeeDAO.delete(id);
        return "redirect:/index";
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexUser")
    public String indexUser(Model model){
        model.addAttribute("user", _userDAO.index());
        return "indexUser";
    }

    @GetMapping("/{id}/user")
    public String showUser(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("user", _userDAO.show(id));
        return "showUser";
    }


    @GetMapping("/newUser")
    public String newUser(@ModelAttribute("user") UserModel userModel){
        // model.addAttribute("person", new PersonModel());
        return "newUser";
    }

    @PostMapping("user")
    public String createUser(@ModelAttribute("user") UserModel userModel){
        _userDAO.save(userModel);
        return "redirect:/indexUser";
    }


    @GetMapping("/{id}/editUser")
    public String editUser(Model model, @PathVariable("id") int id){
        model.addAttribute("user",_userDAO.show(id));
        return "editUser";
    }



    @PatchMapping("/{id}/user")
    public String updateUser(@ModelAttribute("user") UserModel userModel, @PathVariable("id") int id){
        _userDAO.update(id,userModel);
        return "redirect:/indexUser";
    }

    @DeleteMapping("/{id}/user")
    public String deleteUser(@PathVariable("id") int id){
        _userDAO.delete(id);
        return "redirect:/indexUser";
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexProduct")
    public String indexProduct(Model model){
        model.addAttribute("product", _productDAO.index());
        return "indexProduct";
    }

    @GetMapping("/{id}/product")
    public String showProduct(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("product", _productDAO.show(id));
        return "showProduct";
    }


    @GetMapping("/newProduct")
    public String newTeacher(@ModelAttribute("product") ProductModel productModel){
        // model.addAttribute("person", new PersonModel());
        return "newProduct";
    }

    @PostMapping("product")
    public String createProduct(@ModelAttribute("product") ProductModel productModel){
        _productDAO.save(productModel);
        return "redirect:/indexProduct";
    }


    @GetMapping("/{id}/editProduct")
    public String editProduct(Model model, @PathVariable("id") int id){
        model.addAttribute("product",_productDAO.show(id));
        return "editProduct";
    }



    @PatchMapping("/{id}/product")
    public String updateTeacher(@ModelAttribute("product") ProductModel productModel, @PathVariable("id") int id){
        _productDAO.update(id,productModel);
        return "redirect:/indexProduct";
    }

    @DeleteMapping("/{id}/product")
    public String deleteProduct(@PathVariable("id") int id){
        _productDAO.delete(id);
        return "redirect:/indexProduct";
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexOrder")
    public String indexOrder(Model model){
        model.addAttribute("order", _orderDAO.index());
        return "indexOrder";
    }

    @GetMapping("/{id}/order")
    public String showOrder(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("order", _orderDAO.show(id));
        return "showOrder";
    }


    @GetMapping("/newOrder")
    public String newOrder(@ModelAttribute("order") OrderModel orderModel){
        // model.addAttribute("person", new PersonModel());
        return "newOrder";
    }

    @PostMapping("order")
    public String createOrder(@ModelAttribute("order") OrderModel orderModel){
        _orderDAO.save(orderModel);
        return "redirect:/indexOrder";
    }


    @GetMapping("/{id}/editOrder")
    public String editOrder(Model model, @PathVariable("id") int id){
        model.addAttribute("order",_orderDAO.show(id));
        return "editOrder";
    }



    @PatchMapping("/{id}/order")
    public String updateTeacher(@ModelAttribute("order") OrderModel orderModel, @PathVariable("id") int id){
        _orderDAO.update(id,orderModel);
        return "redirect:/indexOrder";
    }

    @DeleteMapping("/{id}/order")
    public String deleteOrder(@PathVariable("id") int id){
        _orderDAO.delete(id);
        return "redirect:/indexOrder";
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexSupplier")
    public String indexSupplier(Model model){
        model.addAttribute("supplier", _supplierDAO.index());
        return "indexSupplier";
    }

    @GetMapping("/{id}/supplier")
    public String showSupplier(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("supplier", _supplierDAO.show(id));
        return "showSupplier";
    }


    @GetMapping("/newSupplier")
    public String newSupplier(@ModelAttribute("supplier") SupplierModel supplierModel){
        // model.addAttribute("person", new PersonModel());
        return "newSupplier";
    }

    @PostMapping("supplier")
    public String createv(@ModelAttribute("supplier") SupplierModel supplierModel){
        _supplierDAO.save(supplierModel);
        return "redirect:/indexSupplier";
    }


    @GetMapping("/{id}/editSupplier")
    public String editSupplier(Model model, @PathVariable("id") int id){
        model.addAttribute("supplier",_supplierDAO.show(id));
        return "editSupplier";
    }



    @PatchMapping("/{id}/supplier")
    public String updateSupplier(@ModelAttribute("supplier") SupplierModel supplierModel, @PathVariable("id") int id){
        _supplierDAO.update(id,supplierModel);
        return "redirect:/indexSupplier";
    }

    @DeleteMapping("/{id}/supplier")
    public String deleteSupplier(@PathVariable("id") int id){
        _supplierDAO.delete(id);
        return "redirect:/indexSupplier";
    }


}
