package ru.serykhd.geoipdemospring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.serykhd.common.net.address.org.apache.commons.validator.routines.InetAddressValidator;
import ru.serykhd.geoip.GeoIPService;
import ru.serykhd.geoip.ipfire.IPFireGeoIP;
import ru.serykhd.geoipdemospring.exception.EmptyLookupException;
import ru.serykhd.geoipdemospring.exception.InvalidAddressException;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class GeoIPServerController {

    private final GeoIPService geoIPService = IPFireGeoIP.INSTANCE;

    public GeoIPServerController() {
        geoIPService.initAndStart();
    }

    @RequestMapping(path = "/iso")
    public String iso(@RequestParam("address") String address) throws UnknownHostException {
        if (!InetAddressValidator.getInstance().isValidInet4Address(address)) {
            throw new InvalidAddressException(address);
        }

        InetAddress inetAddress = Inet4Address.getByName(address);

        Optional<String> countryResponse = geoIPService.getCountryResponse(inetAddress);

        if (countryResponse.isEmpty()) {
            throw new EmptyLookupException();
        }

        return countryResponse.get();
    }
}
