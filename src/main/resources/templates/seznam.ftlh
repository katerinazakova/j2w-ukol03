[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
[#list seznamKontaktu]
[#items as vizitka]
<div class="seznam">
    <a href="/detail">
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
    </a>
</div>
[/#items]
[/#list]
</body>
</html>
