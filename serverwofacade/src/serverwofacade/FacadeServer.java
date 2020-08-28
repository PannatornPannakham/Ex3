/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

public class FacadeServer {
    
    public void StartSV() {
    ScheduleServer SS = new ScheduleServer();
	SS.startBooting();
	SS.readSystemConfigFile();
	SS.init();
	SS.initializeContext();
	SS.initializeListeners();
	SS.createSystemObjects();
    }
    
    public void DestroySV() {
        ScheduleServer SE = new ScheduleServer();
        SE.releaseProcesses();
	SE.destory();
	SE.destroySystemObjects();
	SE.destoryListeners();
	SE.destoryContext();
	SE.shutdown();
    }
    }

