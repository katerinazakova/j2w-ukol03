[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="detail">
    <div class="vizitka">
        <div class="jmeno">${vizitka.jmeno}</div>
        <div class="firma">${vizitka.firma}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${vizitka.ulice}</div>
                <div>${vizitka.obecPSC}</div>
            </div>
            <div class="kontakty">
                [#if vizitka.email??]
                    <div><i class="las la-at"></i> <span>${vizitka.email}</span></div>
                [/#if]
                [#if vizitka.telefon??]
                    <div><i class="las la-phone-alt"></i> <span>${vizitka.telefon}</span></div>
                [/#if]
                [#if vizitka.web??]
                    <div><i class="las la-globe"></i> <span>${vizitka.web}</span></div>
                [/#if]
            </div>
        </div>
    </div>

    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${vizitka.celaAdresa?url}" width="100%" height="100%"
                frameborder="0"></iframe>
    </div>

</div>

</body>
</html>
