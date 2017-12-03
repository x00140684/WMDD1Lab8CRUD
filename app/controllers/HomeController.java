package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.swing.text.StyledEditorKit.ForegroundAction;

// Import model classes
import models.*;

// Import views
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    // declare a private FormFactory instance
    private FormFactory formFactory;
    
    // Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        List<Product> productList = Product.findAll(); 
        return ok(index.render(productList));
    }
    public Result customers(){
        List<Customer> customerList = Customer.findAll();
        return ok(customers.render(customerList));
    }

    // Render and return the add new product page
    public Result addProduct(){
        // Create a form by wrapping the product class
        // in a FormFactory form instance
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(addProduct.render(productForm));
    }





    public Result addProductSubmit(){
        // Retrive the submitted form object (bind from the http request)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // check for errors (based on constraints set in the Product class)
        if(newProductForm.hasErrors()){
            // Display the form again by returning a bad request
            return badRequest(addProduct.render(newProductForm));
        } else {
            // No errors found - extract the product detail from the form
            Product newProduct = newProductForm.get();

            // Save the object to the Products table in the database
            newProduct.save();

            // Set a success message in flash (for display in return view)
            flash("success", "Product "+ newProduct.getName() + " was added");

            // Redirect to the index page
            return redirect(controllers.routes.HomeController.index());

        }
    }


    // Render and return the add now customer page
    public Result addCustomer(){
        // create a form by wrapping the Customer class
        // in a FormFactory form instance
        Form<Customer> customerForm = formFactory.form(Customer.class);
        return ok(addCustomer.render(customerForm));
    }


    public Result addCustomerSubmit(){
        // Retrive the submitted form object (bind from the http request)
        Form<Customer> newCustomerForm = formFactory.form(Customer.class).bindFromRequest();

        // check for errors (based on constraints set in the Product class)
        if(newCustomerForm.hasErrors()){
            // Display the form again by returning a bad request
            return badRequest(addCustomer.render(newCustomerForm));
        } else {
            // No errors found - extract the product detail from the form
            Customer newCustomer = newCustomerForm.get();

            // Save the object to the Products table in the database
            newCustomer.save();

            // Set a success message in flash (for display in return view)
            flash("success", "Customer "+ newCustomer.getFName() + " was added");

            // Redirect to the index page
            return redirect(controllers.routes.HomeController.customers());

        }
    }


    public Result deleteProduct(Long id){
        
        // find product by id and call delete method
        Product.find.ref(id).delete();

        // Add message to flash session
        flash("success","Product has been deleted");

        // Redirect to index page
        return redirect(routes.HomeController.index());
    }


    public Result deleteCustomer(Long id){
        
        // find customer by id and call delete method
        Customer.find.ref(id).delete();

        // Add message to flash session
        flash("success","Customer has been deleted");

        // Redirect to index page
        return redirect(routes.HomeController.customers());
    }

}
