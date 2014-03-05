var myMap = new UIMap(); 

/* Pages */
myMap.addPageset({
name: 'login_page',
description: 'login form on Podorojniki page',  
pathRegexp: 'http://evbyminsd7238.minsk.epam.com:8080/pdrzh/main'  
});

myMap.addPageset({
name: 'main_page',
description: 'main page after user authorization',  
pathRegexp: 'some regexp'  
});

myMap.addPageset({
name: 'registration_page',
description: 'registration page',  
pathRegexp: 'some regexp'  
});

myMap.addPageset({
name: 'edit_profile',
description: 'edit_profile page',
pathRegexp: 'some regexp'
});

myMap.addPageset({
name: 'new_car',
description: 'page for register new_car',
pathRegexp: 'some regexp'
});

/* Elements for registration page */
myMap.addElement('registration_page', {
name: 'r_login_field',
description: 'r_login field',
locator: '//*[@id="login"]'
});
myMap.addElement('registration_page', {
name: 'r_password_field',
description: 'r_password field',
locator: '//*[@id="password"]'
});

myMap.addElement('registration_page', {
name: 'r_conf_password_field',
description: 'r_conf password field',
locator: '//*[@id="confirmPassword"]'
});

myMap.addElement('registration_page', {
name: 'r_phone_field',
description: 'r_phone field',
locator: '//*[@id="phone"]'
});

myMap.addElement('registration_page', {
name: 'r_email_field',
description: 'r_e-mail field',
locator: '//*[@id="email"]'
});

myMap.addElement('registration_page', {
name: 'r_agree_check',
description: 'r_agree field',
locator: '/html/body/div/div[2]/div/div/div/div/form/fieldset/div[7]/input'
});
myMap.addElement('registration_page', {
name: 'r_submit_btn',
description: 'r_submit button',
locator: '//*[@id="b"]'
});

myMap.addElement('registration_page', {
name: 'r_back_btn',
description: 'r_back button',
locator: '/html/body/div/div[2]/div/div/div/div/form/fieldset/a'
});

/* Elements for login page*/
myMap.addElement('login_page', {
name: 'login_field',
description: 'login field',
locator: '//*[@id="inputUsername"]'
});

myMap.addElement('login_page', {
name: 'password_field',
description: 'password field',
locator: 'inputPassw'
});

myMap.addElement('login_page', {
name: 'login_btn',
description: 'login button',
locator: '//*[@class="btn btn-primary" and @name="submit"]'
});

myMap.addElement('login_page', {
name: 'register_link',
description: 'registration link',
locator: '/html/body/div/div/div[2]/form/fieldset/div[2]/div/p/a'
});

/* Elements for main page*/

myMap.addElement('main_page', {
name: 'logout_btn',
description: 'logout button',
locator: '//*[@class="btn btn-default" and @href="/pdrzh/j_spring_security_logout"]'
});

myMap.addElement('main_page', {
name: 'username',
description: 'user name',
locator: '/html/body/div/div/div[2]/div/div'   //'//*[@id="log"]'
});
myMap.addElement('main_page',{
name: 'edit_btn',
description: 'edit profile button',
locator: '//*[@class="btn btn-primary" and @href="/pdrzh/client/edit_profile"]'

});
/*Elements for new_car page*/

myMap.addElement('new_car',{
name:'nc_color_field',
description:'Car color',
locator:'//*[@id="color"]'
});
myMap.addElement('new_car',{
name:'nc_vendor_field',
description:'vendor',
locator:'//*[@id="vendor"]'
});
myMap.addElement('new_car',{
name:'nc_model_field',
description:'Car model',
locator:'//*[@id="model"]'
});
myMap.addElement('new_car',{
name:'nc_year_field',
description:'Car year',
locator:'//*[@id="year"]'
});
myMap.addElement('new_car',{
name:'nc_number_field',
description:'Car number',
locator:'//*[@id="number"]'
});
myMap.addElement('new_car',{
name:'nc_seats_field',
description:'number of seats',
locator:'//*[@id="seats"]'
});
myMap.addElement('new_car',{
name:'nc_conditioner_check',
description:'Conditioner presentence',
locator:'//*[@id="conditioner1"]'
});
myMap.addElement('new_car',{
name:'nc_radio_check',
description:'Radio presentence',
locator:'//*[@id="radio1"]'
});
myMap.addElement('new_car',{
name:'nc_music_player_check',
description:'Music player presentence',
locator:'//*[@id="musicPlayer1"]'
});




myMap.addElement('new_car',{
name: 'nc_save_btn',
description:'save new car button',
locator: '//*[@class="btn btn-primary" and @name="idCar"]'
});

myMap.addElement('new_car',{
name: 'nc_cancel_btn',
description:'cancel button on new_car page',
locator: '/html/body/div/div[2]/div[2]/div/div/div/form/fieldset/div[10]/div/button[2]'
});

myMap.addElement('new_car',{
name: 'nc_back_link',
description: 'back_button link',
locator: '/html/body/div/div[2]/div[2]/div/div/div[2]/a'
});

/* Elements for edit_profile page */

myMap.addElement ('edit_profile',{
name: 'e_register_nc_link',
description: 'link to register new car from edit_profile page',
locator: '//*[@class="well"]/a[@href="/pdrzh/client/new_car"]'
});

