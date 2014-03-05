var manager = new RollupManager();

/* Open start page */
manager.addRollupRule({
    name: 'open_start_page'
    , description: 'Open start page'
    , args: []
	, pre: ''
	, post: 'Start page is opened'
    , commandMatchers: []
	, getExpandedCommands: function(args) {
		var commands = [];
		commands.push({
			command: 'open'
			, target: '/pdrzh/main'
		});
		commands.push({
			command: 'waitForPageToLoad'
		});
		
		
		return commands;
	}
});



/* Register */

manager.addRollupRule({
    name: 'register_user'
    , description: 'Performs registration'
    , args: [
		{
			name: 'rlogin' 
			, description: 'rlogin'
		}
		, {
			name: 'rpass'
			, description: 'rpassword'
		}
		, {
			name: 'phone'
			, description: 'phone number'
		}
		, {
			name: 'email'
			, description: 'email'
		}
    ] 
	, pre: 'Podorojniki start page is opened'
	, post: 'User is registered in the system'
    , commandMatchers: []
	, getExpandedCommands: function(args) {
		var commands = [];
	/*press registration link */
	
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=login_page::register_link()'
		});
		commands.push({
			command: 'clickAndWait'
			, target: 'ui=login_page::register_link()'
		});

		
	/*Checking presence of input fields and buttons */
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=registration_page::r_login_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=registration_page::r_password_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=registration_page::r_conf_password_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=registration_page::r_phone_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=registration_page::r_email_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=registration_page::r_agree_check()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=registration_page::r_submit_btn()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=registration_page::r_back_btn()'
		});
		
		
	/*Checking editable fields */
		commands.push({
			command: 'assertEditable'
			, target: 'ui=registration_page::r_login_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=registration_page::r_password_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=registration_page::r_conf_password_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=registration_page::r_phone_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=registration_page::r_email_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=registration_page::r_agree_check()'
		});
		
	
		
		
	/*Type and check registration information*/
		commands.push({
			command: 'type'
			, target: 'ui=registration_page::r_login_field()'
			, value: args.rlogin
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=registration_page::r_login_field()'
			, value: args.rlogin
		});
	
		commands.push({
			command: 'type'
			, target: 'ui=registration_page::r_password_field()'
			, value: args.rpass
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=registration_page::r_password_field()'
			, value: args.rpass
		});
		
		commands.push({
			command: 'type'
			, target: 'ui=registration_page::r_conf_password_field()'
			, value: args.rpass
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=registration_page::r_conf_password_field()'
			, value: args.rpass
		});
		
		commands.push({
			command: 'type'
			, target: 'ui=registration_page::r_phone_field()'
			, value: args.phone
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=registration_page::r_phone_field()'
			, value: args.phone
		});
		
		commands.push({
			command: 'type'
			, target: 'ui=registration_page::r_email_field()'
			, value: args.email
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=registration_page::r_email_field()'
			, value: args.email
		});
	/*checkbox*/
		commands.push({
			command: 'check'
			, target: 'ui=registration_page::r_agree_check()'
		});
		commands.push({
			command: 'assertChecked'
			, target: 'ui=registration_page::r_agree_check()'
		});
	/*Registration confirmation*/
		commands.push({
			command: 'clickAndWait'
			, target: 'ui=registration_page::r_submit_btn()'
		});
	/*check logout button presence */

		
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=main_page::logout_btn()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=main_page::username()'
		});
		commands.push({
			command: 'assertText'
			, target: 'ui=main_page::username()'
			, value: args.rlogin
		});
		
		return commands;
	}
});


/* Login */
manager.addRollupRule({
    name: 'do_login'
    , description: 'Performs a login'
    , args: [
		{
			name: 'login' 
			, description: 'login'
		}
		, {
			name: 'pass'
			, description: 'password'
		}		
    ]
	, pre: 'Podorojniki start page is opened'
	, post: 'User logged to the system'
    , commandMatchers: []
	, getExpandedCommands: function(args) {
		var commands = [];
		// fields presence check
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=login_page::login_field()'
			, value: args.login
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=login_page::password_field()'
			, value: args.login
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=login_page::login_btn()'
			, value: args.login
		});
				
		commands.push({
			command: 'assertEditable'
			, target: 'ui=login_page::login_field()'
			, value: args.login
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=login_page::password_field()'
			, value: args.login
		});
				
		//login process
		commands.push({
			command: 'type'
			, target: 'ui=login_page::login_field()'
			, value: args.login
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=login_page::login_field()'
			, value: args.login
		});
			
		commands.push({
			command: 'type'
			, target: 'ui=login_page::password_field()'
			, value: args.pass
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=login_page::password_field()'
			, value: args.pass
		});
			
		commands.push({
			command: 'clickAndWait'
			, target: 'ui=login_page::login_btn()'
		});
		//redirect check
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=main_page::logout_btn()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=main_page::username()'
		});
		commands.push({
			command: 'assertText'
			, target: 'ui=main_page::username()'
			, value: args.login
		});
		
		return commands;
	}
});


/* Input new car values */
manager.addRollupRule({
    name: 'input_new_car_value'
    , description: 'Inputs information about new car'
    , args: [
		{
			name: 'color' 
			, description: 'color'
		},
		{
			name: 'vendor'
			, description: 'vendor'
		},
		{
			name: 'model' 
			, description: 'model'
		},
		{
			name: 'year'
			, description: 'year'
		},
		{
			name: 'number' 
			, description: 'number'
		},
		{
			name: 'seats_amount'
			, description: 'seats_amount'
		}
		
    ]
	, pre: 'Add new car page is open'
	, post: 'User is on edit profile page'
    , commandMatchers: []
	, getExpandedCommands: function(args) {
		var commands = [];
		
		/*Assert location*/
		
		commands.push({
			command: 'assertLocation'
			, target: 'http://evbyminsd7238.minsk.epam.com:8080/pdrzh/client/new_car'
		});
		
		/*Elements presence check*/
		
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_color_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_vendor_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_year_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_year_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_number_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_seats_field()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_conditioner_check()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_radio_check()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_music_player_check()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_save_btn()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_cancel_btn()'
		});
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=new_car::nc_seats_field()'
		});
		
		/*Check if editable*/
		
		commands.push({
			command: 'assertEditable'
			, target: 'ui=new_car::nc_color_field()'
			, value: args.login
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=new_car::nc_vendor_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=new_car::nc_model_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=new_car::nc_year_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=new_car::nc_number_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=new_car::nc_seats_field()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=new_car::nc_conditioner_check()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=new_car::nc_radio_check()'
		});
		commands.push({
			command: 'assertEditable'
			, target: 'ui=new_car::nc_music_player_check()'
		});
		
				
		/* Type and check car information */
		
		commands.push({
			command: 'type'
			, target: 'ui=new_car::nc_color_field()'
			, value: args.color
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=new_car::nc_color_field()'
			, value: args.color
		});
		commands.push({
			command: 'type'
			, target: 'ui=new_car::nc_vendor_field()'
			, value: args.vendor
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=new_car::nc_vendor_field()'
			, value: args.vendor
		});
		commands.push({
			command: 'type'
			, target: 'ui=new_car::nc_model_field()'
			, value: args.model
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=new_car::nc_model_field()'
			, value: args.model
		});
		commands.push({
			command: 'type'
			, target: 'ui=new_car::nc_year_field()'
			, value: args.year
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=new_car::nc_year_field()'
			, value: args.year
		});
		commands.push({
			command: 'type'
			, target: 'ui=new_car::nc_number_field()'
			, value: args.number
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=new_car::nc_number_field()'
			, value: args.number
		});
		commands.push({
			command: 'type'
			, target: 'ui=new_car::nc_seats_field()'
			, value: args.seats_amount
		});
		commands.push({
			command: 'assertValue'
			, target: 'ui=new_car::nc_seats_field()'
			, value: args.seats_amount
		});
		
		/* Checkbox */
	
		commands.push({
			command: 'check'
			, target: 'ui=new_car::nc_conditioner_check()'
		});
		commands.push({
			command: 'assertChecked'
			, target: 'ui=new_car::nc_conditioner_check()'
		});
		commands.push({
			command: 'check'
			, target: 'ui=new_car::nc_radio_check()'
		});
		commands.push({
			command: 'assertChecked'
			, target: 'ui=new_car::nc_radio_check()'
		});
		commands.push({
			command: 'check'
			, target: 'ui=new_car::nc_music_player_check()'
		});
		commands.push({
			command: 'assertChecked'
			, target: 'ui=new_car::nc_music_player_check()'
		});
				
	return commands;
	}
});
manager.addRollupRule({
	name: 'open_edit_profile'
	, description: 'open edit_profile page'
	, args: []
	, pre: 'User logged to the system'
	, post: 'edit profile page opened'
    , commandMatchers: []
	, getExpandedCommands: function(args) {
		var commands = [];
		// go to edit_profile page
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=main_page::edit_btn()'
		});
		commands.push({
			command: 'clickAndWait'
			, target: 'ui=main_page::edit_btn()'
		});
		//check redirect to edit_profile page
		commands.push({
			command: 'assertLocation'
			, target: 'http://evbyminsd7238.minsk.epam.com:8080/pdrzh/client/edit_profile'
		});
		//go to page of registering new car
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=edit_profile::e_register_nc_link()'
		});
		commands.push({
			command: 'clickAndWait'
			, target: 'ui=edit_profile::e_register_nc_link()'
		});
		//check redirect to new car registration
		commands.push({
			command: 'assertLocation'
			, target: 'http://evbyminsd7238.minsk.epam.com:8080/pdrzh/client/new_car'
		});
		
		return commands;
	}
});
//car registartion//
manager.addRollupRule({
	name: 'register_car'
	, description: 'register new car '
	, args: []
	, pre: 'new_car page is opened, all fields on new_car page are filled '
	, post: 'edit_profile page is opened'
    , commandMatchers: []
	, getExpandedCommands: function(args) {
		var commands = [];
		
		
		commands.push({
			command: 'clickAndWait'
			, target: 'ui=new_car::nc_save_btn()'
		});
		commands.push({
			command: 'assertLocation'
			, target: 'http://evbyminsd7238.minsk.epam.com:8080/pdrzh/client/edit_profile'
		});

		
		return commands;
	}
});
//logout//
manager.addRollupRule({
	name: 'logout'
	, description: 'logout function '
	, args: []
	, pre: ''
	, post: 'mane_page is opened'
    , commandMatchers: []
	, getExpandedCommands: function(args) {
		var commands = [];
		
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=main_page::logout_btn()'
		});
		commands.push({
			command: 'clickAndWait'
			, target: 'ui=main_page::logout_btn()'
		});
		commands.push({
			command: 'assertLocation'
			, target: 'http://evbyminsd7238.minsk.epam.com:8080/pdrzh/main'
		});
	
		return commands;
	}
});
	/*Car remove*/
manager.addRollupRule({
	name: 'remove_car'
	, description: 'Removing last car '
	, args: []
	, pre: 'There are cars in table, edit_profile page is opened'
	, post: 'last car removed'
    , commandMatchers: []
	, getExpandedCommands: function(args) {
		var commands = [];
		
		commands.push({
			command: 'assertElementPresent'
			, target: 'ui=edit_profile::car_remove_link()'
		});
		commands.push({
			command: 'clickAndWait'
			, target: 'ui=edit_profile::car_remove_link()'
		});
		/*commands.push({
			command: 'assertLocation'
			, target: 'http://evbyminsd7238.minsk.epam.com:8080/pdrzh/client/edit_profile'
		});*/
	
		return commands;
	}
});	
	
