# mahesh-lingabthula-rms
My first repository in github
      First of all thanku for RubiconRed team for giving this oppurtunity.
      
       HOW I DONE THIS PROJECT:
       
  I have used ECLIPSE editor for developing this project.As per the instructions given the Read.me document I follwed                       according to that.
  I have developed five clases/ modules for this Restaurant Management System.They are
  1.Customer class.
  2.Menu class.
  3.Item class.
  4.Order Class
  5.Register Class/Payment Class
  
  CUSTOMER CLASS:
                 Customer is the only person who is very important for the Resturant.
          So I developed customer class in this way..
          
  Whenever customer enters in to a restaurant he will be seated in a table.Then he sees the menu card which will be on the table.
  On menu card the restaurant varieties will be dispalyed along with menu.
   So I printed grettings for the customer.Then he see the menu and select any item from the menu .If he want view the full menu or Sectional menu, he can view any one of them as per his requirement.
     If he want to select from the sectional menu he can select ,Then he places the order .
     
      For placing the order ,order class is required..
      
      ORDER CLASS:
                 In a order we have list of items.So to store a  list of items I have used the ArrayList class and created a object to store all the items.
  Now the customer can place a order or delete a order from the list of items.
  So order class have various operations which are operated by the customer,They are
  addItem(),removeItem(),ClearOrder()  etc.
   In the restaurant we have many servents to serve the food and to take the order also.
    So the cutomer can call a random sever from a group of server to take the order and serve food to him/her.
    So to call a random customer I have used the switch case concept.
    
     Before ordering the order customer will see the menu,So we need a menu class 
     
     MENU CLASS:
         Menu consists a list of items,So to store a list of items I have used the ArrayList class for each category of the items like Starters,beverages,main course,desserts,ice creams etc and each category has list of items so to add list of items to category I used adda() methos to store this items into a particualr category.
         
         
         Now after seeing the menu customer wants to know the price ,size ,category of the items.So for this we need to create the Item class
         ITEM CLASS:
               Item class have category of items like Starters,beverages,maincourse,icecreams,desserts etc.So to set name,price,size ,category of items I have used  setname(),setprice(),setSize(),setcategory() methods.
               tostring method is used to represent the string rreoresentation of the object.
               
               
               After ordering the order and server served the food and customer finished his/her items ,now it's the time to give the bill to the customer.So we need to create the registet/payment class
               
      REGISTER CLASS:
               
               
               To give bill to the customer the order should be registered first,Then manager should check whether the given amount given by the customer is enough or not.
               In register class we have three main elements they are TAX,SUBTOTAL and TOTAL.
               Once the order is registered ,total amount is caluculated with related to the subtotal and tax.
               if amount given by customer is equal to the payment paid by him ,it will be printed as enough money is renderd and if amount paid by him his more than the total ,required change is given to him and if amount paid by is lesser than the amount, he/she will be asked to pay required amount of money.
               
              After payment of the money customer will exit from the customer.
              
              My project can be run and executed through eclipse .
            
            
            
       THANK YOU ONCE AGAIN FOR THE RUBICONRED TEAM FOR GIVING ME THIS OPPURTUNITY,I HAVE LEARNED A LOT FROM THIS PROJECT.
        Till now i don't have  any ecxperience of the realworld problems, from this project I have learned how to code to real time problems which will help me in the future.
         
         
        
         
         
         
         
