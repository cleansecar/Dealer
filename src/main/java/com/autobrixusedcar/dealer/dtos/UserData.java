package com.autobrixusedcar.dealer.dtos;

public interface UserData {

    public Long getuser_id();
    public String getfirst_name();

    
    public Long getemployeeId();
    public String getemployeeName();
    public String getphoneNo();
    public String getemployeeCode();
    public String getemailId();
    public String getrole();
    public Long getroleId();
    public String getotp_type();
    
    
    
    public String getverticalName();
    public Long getabServiceId();
    
    
    public Long getcityId();
    public String getcity();
    public Long getcity_id();
    
    public Long getrevenue();
    public Long getexpenditure();
    
    
    public Long getvertical();
    public String getscreen_type();
    public String getschedule_time();
    public Long gettotal_services();
    public Long getrevenue_percentage();
    public Long getexpenditure_percentage();
    public String getrevenue_percentage_value();
    public String getexpenditure_percentage_value();
    
    
    
    
    public Long gettotal_employees();
    
    public Long getcross_utilization();
    
    public Long getcurrent_utilization_percentage();
     public Long getprevious_total_employees_percentage();
     public Long getprevious_cross_utilization_percentage();
     public String getprevious_total_status();
    public String getprevious_cross_utilization_status();
    
    
    
    
    public Long getprofit_loss_amount();
    public Long getprofit_loss_percentage();
    
    
    
    
    
    public String getprofit_loss_status();
    
    
    
    
    
    
    
    public Long getFacebook_total_percentage();
    public Long getGoogle_source_id();
    public Long getOthers_source_id();
    
    
    
    public Long getFacebook_source_id();
    public Long getGoogle_total_percentage();
    public Long getOthers_total_percentage();
    
    
    
    public Long gettotal_leads();
    public Long getlead_percentage();
    public String getlead_status();
    
    
    
    public Long gettotal_amount_spent();
    public Long gettotal_amount_spent_percentage();
    public String gettotal_amount_spent_status();
        
    
    public Long getLeads();
    
//    public Long getRevenue();
    public Long getSpent();
    
    
    public Long getab_service_id();
    public String getdashboard_screen_type();
    
    
    
    
    public Long getcp_lead();
    public Long getcp_schedule();
    public Long getcp_completed();
    
    
    public Long getcomplete_percentage();
    
    public Long getschedule_percentage();
    
    
    
    
    
    public Long getops_ct_expenditure();
    public Long getops_ct_dm_expenditure();
    public Long getpending_revenue();
public Long gettotal_service_leads();


public Long gett_total_services();
public Long getdt_total_services();
public Long getdat_services();
public Long gettotal_dm_expenditure();

    public Long gettotal_scheduled();
    public Long gettotal_completed();
    
    
    public Long getleads_vs_schedule();
    public Long getschedule_vs_complete();
    public Long getleads_vs_completed();
    
    public String getleads_vs_schedule_Value();
    public String getschedule_vs_complete_Value();
    public String getleads_vs_completed_Value();
    
    public Long getprofit_loss();

    public Long getleadcount();
    
    public Long getservice_id();
    public String getservice_name();
    
    
    
    public Long getscheduled();
    public Long getcompleted();
    public long getwork_in_progress();
    
    public Long getcancelled();
   public Long getresheduled();
   public Long getrnr();
   public Long getcancell_percentage();

   public Long getresheduled_percentage();
   public Long getrnr_percentage();
   public String getcancell_percentage_value();
   public String getresheduled_percentage_value();
   public String getrnr_percentage_value();
   
    
    public Long getscheduled_percentage();
    public Long getcompleted_percentage();
    public Long getwork_in_progress_percentage();    
    public String getscheduled_percentage_status();
    public String getcompleted_percentage_status();
    public String getwork_in_progress_percentage_status();
    public String getcancell_percentage_status();
    public String getresheduled_percentage_status();
    public String getrnr_percentage_status();
     public Long getnot_updated_yet();
     public Long getnot_updated_yet_percentage();
     public String getnot_updated_yet_percentage_status();
     public Long getexpendituree();
     public String getprofit_loss_percentage_status();
      
     public Long getrevenue_ser();
     public Long getexpenditure_ser();
     public Long getrevenue_ser_percentage();
     public Long getexpenditure_ser_percentage();
     public String getrevenue_ser_percentage_status();
     public String getexpenditure_ser_percentage_status();
     
    public Long getpackage_id();
    public Long getvehicle_type_id();
    
    public Long gettotal_vehicles();
    public Long gettotal_cleaned();
    public Long gettotal_tickets();
    public Long getun_cleaned();
    public Long getun_cleaned_percentage();
    public String getun_cleaned_percentage_status();
    
    public Long getdroped_vehicles();
    public Long getdroped_vehicles_percentage();
    public String getdroped_vehicles_percentage_status();
    
    public Long getunpaid_customers();
    public Long getunpaid_percentage();
    public String getunpaid_percentage_status();
    
    
    public String getvehicle_type();
    
    public Long gettotal_cars();
    
    public Long getcleaned_cars();
    public Long getdropped_cars();
    public Long getun_paid_cars();
    
    public Long getunclenaed();
    
    
    public Long gettotal_cars_percentage();
    public Long getcleaned_cars_percentage();
    public Long gettickets_percentage();
    public Long getdropped_percentage();
    public Long getuncleaned_percentage();

    
    public String gettotal_cars_percentage_status();
    public String getcleaned_cars_percentage_status();
    public String gettickets_percentage_status();
    public String getdropped_percentage_status();
    public String getuncleaned_percentage_status();    
    public Long getrevenue_exe();
    public Long getexpenditure_exe();
    public String getrevenue_percentage_status();
    public String getexpenditure_percentage_status();
    
    public Long getrevenue_percentage_exe();
    public Long getexpenditure_percentage_exe();
    public String getrevenue_percentage_exe_status();
    public String getexpenditure_percentage_exe_status();
    
    
    public Long gettotal_employees_percentage();
    
    public String gettotal_employees_percentage_status();
    
    
    public Long gettotal_services_percentage();
    public String gettotal_services_percentage_status();
    public Long getavg_revenue_ser();
    public Long getavg_revenue_percentage();
    public String getavg_revenue_percentage_status();
   public Long getservies_count();
   
   public Long getservies_count_percentage();
   public String getservies_count_percentage_status();
   
   
   public String getcomplete_percentage_status();
   public String getschedule_percentage_status();
   
    public Long getcompletion_percentage();
    public Long getprevious_completion_percentage();
    public String getcompletion_percentage_status();
    
    public Long getcpc();
    public Long getcps();
    public Long getcpl();
    
    public Long gettotal_facebook_leads();
    public Long gettotal_google_leads();
    public Long gettotal_organic_leads();
    public Long getfb_cpl();
    public Long getgoogle_cpl();
    public Long getorganic_cpl();
    public Long getfb_cpc();
    public Long getgoogle_cpc();
    public Long getorganic_cpc();
    public Long getnet_profit_loss();
    public Long gets_to_c();
    public Long getl_to_c();
    public Long getrepeated_customers();
    

    public String gettotal_amount_spent_percentage_status();
    
    public Long gettotal_cpc_percentage();
    public String gettotal_cpc_percentage_status();
    
    public Long gettotal_cps_percentage();
    public String gettotal_cps_percentage_status();
    
    public Long gettotal_leads_percentage();
    public String gettotal_leads_percentage_status();
    
    public Long gettotal_cpl_percentage();
    public String gettotal_cpl_percentage_status();
    
    
    
    public Long getlead_fb();
    public Long getlead_google();
    public Long getspent_fb();
    public Long getspent_google();
    public Long getcpl_fb();
    public Long getcpl_google();
    public Long getcpc_fb();
    public Long getcpc_google();
    public Long getcps_fb();
    public Long getcps_google();
    public Long getnot_called_lead();
    
    
    
    public Long getvertical_id();
    
    public String getselected_date();
    
    public String getrole_name();
    public Long getrole_id();
    
    


}
