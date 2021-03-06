package by.grouk.callhandler.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import by.grouk.callhandler.dao.PhoneCallDao;
import by.grouk.callhandler.dto.PhoneCallDto;
import by.grouk.callhandler.model.PhoneCall;
import by.grouk.callhandler.service.PhoneCallService;

/**
 * Created by Alena_Grouk on 7/22/2016.
 */
@Service
public class PhoneCallServiceImpl extends AbstractService implements PhoneCallService {

    @Resource
    private PhoneCallDao phoneCallDao;

    public void addCall(PhoneCallDto call) {
        PhoneCall phoneCall = (PhoneCall) convert(null, call, PhoneCall.class);
        phoneCallDao.addCall(phoneCall);
    }

    @Override
    public PhoneCallDto createPhoneCall() {
        PhoneCall phoneCall = phoneCallDao.getPhoneCall();
        PhoneCallDto phoneCallDto = (PhoneCallDto) convert(null, phoneCall, PhoneCallDto.class);
        return phoneCallDto;
    }
}
