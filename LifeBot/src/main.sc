theme: /

    state: newNode_43
        if: $session.rawRequest.payload.character.name === "Сбер"
            go!: /newNode_0
        elseif: $session.rawRequest.payload.character.name === "Афина"
            go!: /newNode_0
        elseif: $session.rawRequest.payload.character.name === "Джой"
            go!: /newNode_45
    @IntentGroup
        {
          "boundsTo" : "",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_53
        state: 1
            e: Выход

            go!: /newNode_41
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_53",
                name: "newNode_53 buttons",
                handler: function($context) {
                }
            });

    state: newNode_0
        a: Ваш помощник рад вас приветствовать у себя и всегда готов помочь вам во всём! Приветствую!
        go!: /newNode_1
    @IntentGroup
        {
          "boundsTo" : "/newNode_0",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Привет",
              "transition" : "/newNode_2"
            } ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_1
        state: 1
            e: Привет

            go!: /newNode_2

        state: Fallback
            event: noMatch
            go!: /newNode_3
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_1",
                name: "newNode_1 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Привет"
                    , transition: "/newNode_2"
                    },
                  ]);
                }
            });

    state: newNode_45
        a: Твой помощник рад тебя приветствовать у себя и всегда готов помочь тебе во всём! Приветствую!
        go!: /newNode_46
    @IntentGroup
        {
          "boundsTo" : "/newNode_45",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Привет",
              "transition" : "/newNode_49"
            } ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_46
        state: 1
            e: Привет
            e: Здравствуй
            e: Здравствуйте!

            go!: /newNode_49

        state: Fallback
            event: noMatch
            go!: /newNode_47
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_46",
                name: "newNode_46 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Привет"
                    , transition: "/newNode_49"
                    },
                  ]);
                }
            });

    state: newNode_2
        a: Мне, как вашему помощнику, искренне радостно слышать слова приветствия от вас.
        # Transition /newNode_4
        go!: /newNode_5

    state: newNode_3
        a: Не очень культурно с вашей стороны не здороваться, но я не обидчивый ассистент
        # Transition /newNode_9
        go!: /newNode_5

    state: newNode_41
        EndSession:

    state: newNode_47
        a: Не очень культурно с твоей стороны не здороваться, но я не обидчивый ассистент
        # Transition /newNode_48
        go!: /newNode_50

    state: newNode_49
        a: Мне, как твоему помощнику, искренне радостно слышать слова приветствия от тебя.
        # Transition /newNode_51
        go!: /newNode_50

    state: newNode_5
        a: На данный момент в приложении реализованы следующие направления: психологическая помощь, финансы. В любой момент вы можете выйти на это сообщение командой "главное меню".
        go!: /newNode_6
    @IntentGroup
        {
          "boundsTo" : "/newNode_5",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Психологическая помощь",
              "transition" : "/newNode_7"
            }, {
              "name" : "Финансы",
              "transition" : "/newNode_22"
            } ],
            "type" : "buttons"
          } ],
          "global" : true
        }
    state: newNode_6
        state: 1
            e!: Психологическая помощь

            go!: /newNode_7

        state: 2
            e!: Финансы

            go!: /newNode_22

        state: 3
            e!: Главное меню

            go!: /newNode_5

        state: 4
            e!: Выход

            go!: /newNode_41

        state: Fallback
            event: noMatch
            go!: /newNode_5
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_6",
                name: "newNode_6 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Психологическая помощь"
                    , transition: "/newNode_7"
                    },
                    {text: "Финансы"
                    , transition: "/newNode_22"
                    },
                  ]);
                }
            });

    state: newNode_50
        a: На данный момент в приложении реализованы следующие направления: психологическая помощь, финансы. В любой момент ты можешь выйти на это сообщение командой "главное меню".
        go!: /newNode_52
    @IntentGroup
        {
          "boundsTo" : "/newNode_50",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Психологическая помощь",
              "transition" : "/newNode_54"
            }, {
              "name" : "Финансы",
              "transition" : "/newNode_73"
            } ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_52
        state: 1
            e: Психологическая помощь

            go!: /newNode_54

        state: 2
            e: Финансы

            go!: /newNode_73

        state: 3
            e: Главное меню

            go!: /newNode_50

        state: 4
            e: Выход

            go!: /newNode_41

        state: Fallback
            event: noMatch
            go!: /newNode_50
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_52",
                name: "newNode_52 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Психологическая помощь"
                    , transition: "/newNode_54"
                    },
                    {text: "Финансы"
                    , transition: "/newNode_73"
                    },
                  ]);
                }
            });

    state: newNode_7
        a: Как личный помощник, я всегда раду буду вам помочь справиться со своими личными, а также возможно проблемами близких вам людей.
        go!: /newNode_10
    @IntentGroup
        {
          "boundsTo" : "/newNode_7",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Блок депрессия",
              "transition" : "/newNode_11"
            }, {
              "name" : "Блок отчаяение",
              "transition" : "/newNode_14"
            }, {
              "name" : "Назад",
              "transition" : "/newNode_5"
            }, {
              "name" : "Главное меню",
              "transition" : "/newNode_5"
            } ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_10
        state: 1
            e: Блок депрессия

            go!: /newNode_11

        state: 2
            e: Блок отчаяение

            go!: /newNode_14

        state: 3
            e: Назад

            go!: /newNode_5

        state: 4
            e: Выход

            go!: /newNode_41
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_10",
                name: "newNode_10 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Блок депрессия"
                    , transition: "/newNode_11"
                    },
                    {text: "Блок отчаяение"
                    , transition: "/newNode_14"
                    },
                    {text: "Назад"
                    , transition: "/newNode_5"
                    },
                    {text: "Главное меню"
                    , transition: "/newNode_5"
                    },
                  ]);
                }
            });

    state: newNode_22
        a: Финансовые проблемы бьют не только по вашему кошельку, но и также по вашим нервам. Как личный помощник я всегда будут рад вам помочь.
        go!: /newNode_23
    @IntentGroup
        {
          "boundsTo" : "/newNode_22",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Кредит",
              "transition" : "/newNode_24"
            }, {
              "name" : "Ипотека",
              "transition" : "/newNode_29"
            }, {
              "name" : "Назад",
              "transition" : "/newNode_5"
            }, {
              "name" : "Главное меню",
              "transition" : "/newNode_5"
            } ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_23
        state: 1
            e: Кредит

            go!: /newNode_24

        state: 2
            e: Ипотека

            go!: /newNode_29

        state: 3
            e: Назад

            go!: /newNode_5

        state: 4
            e: Выход

            go!: /newNode_41

        state: Fallback
            event: noMatch
            go!: /newNode_22
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_23",
                name: "newNode_23 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Кредит"
                    , transition: "/newNode_24"
                    },
                    {text: "Ипотека"
                    , transition: "/newNode_29"
                    },
                    {text: "Назад"
                    , transition: "/newNode_5"
                    },
                    {text: "Главное меню"
                    , transition: "/newNode_5"
                    },
                  ]);
                }
            });

    state: newNode_54
        a: Как личный помощник, я всегда раду буду тебе помочь справиться со своими личными, а также возможно проблемами близких тебе людей.
        go!: /newNode_55
    @IntentGroup
        {
          "boundsTo" : "/newNode_54",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Блок отчаяние",
              "transition" : "/newNode_60"
            }, {
              "name" : "Блок дипрессия",
              "transition" : "/newNode_64"
            }, {
              "name" : "Назад",
              "transition" : "/newNode_50"
            }, {
              "name" : "Главное меню",
              "transition" : "/newNode_50"
            } ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_55
        state: 1
            e: Блок отчаяние

            go!: /newNode_60

        state: 2
            e: Блок дипрессия

            go!: /newNode_64

        state: 3
            e: Назад

            go!: /newNode_50

        state: 4
            e: Выход

            go!: /newNode_41

        state: Fallback
            event: noMatch
            go!: /newNode_54
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_55",
                name: "newNode_55 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Блок отчаяние"
                    , transition: "/newNode_60"
                    },
                    {text: "Блок дипрессия"
                    , transition: "/newNode_64"
                    },
                    {text: "Назад"
                    , transition: "/newNode_50"
                    },
                    {text: "Главное меню"
                    , transition: "/newNode_50"
                    },
                  ]);
                }
            });

    state: newNode_73
        a: Финансовые проблемы бьют не только по твоему кошельку, но и также по твоим нервам. Как личный помощник я всегда будут рад тебе помочь.
        go!: /newNode_74
    @IntentGroup
        {
          "boundsTo" : "/newNode_73",
          "actions" : [ {
            "buttons" : [ {
              "name" : "Кредит",
              "transition" : "/newNode_61"
            }, {
              "name" : "Ипотека",
              "transition" : "/newNode_58"
            }, {
              "name" : "Назад",
              "transition" : "/newNode_50"
            }, {
              "name" : "Главное меню",
              "transition" : "/newNode_50"
            } ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_74
        state: 1
            e: Кредит

            go!: /newNode_61

        state: 2
            e: Ипотека

            go!: /newNode_58

        state: 3
            e: Назад

            go!: /newNode_50

        state: 4
            e: Выход

            go!: /newNode_41

        state: Fallback
            event: noMatch
            go!: /newNode_73
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_74",
                name: "newNode_74 buttons",
                handler: function($context) {
                  $reactions.buttons([
                    {text: "Кредит"
                    , transition: "/newNode_61"
                    },
                    {text: "Ипотека"
                    , transition: "/newNode_58"
                    },
                    {text: "Назад"
                    , transition: "/newNode_50"
                    },
                    {text: "Главное меню"
                    , transition: "/newNode_50"
                    },
                  ]);
                }
            });

    state: newNode_31
        a:  Прочитайте кредитный договор\n
            В любой непонятной ситуации первым делом смотрите кредитный договор. Там написано, что вас ждёт за задержку платежей и что — за систематическую неуплату.\n
            Найдите раздел договора, в котором описано, в каких случаях и как банк может забрать квартиру за долги.  Это нужно, чтобы подготовиться к переговорам.
        # Transition /newNode_32
        go!: /newNode_33

    state: newNode_29
        a:  Что будет, если не выплачивать ипотеку и скрываться от банка\n
            Многим психологически сложно признаться, что денег на выплату кредита нет, и когда они будут — неизвестно. Иногда люди начинают скрываться от банка не из-за того, что они «злостные неплательщики», а просто от растерянности. И тогда события развиваются по самому негативному сценарию.
        # Transition /newNode_30
        go!: /newNode_31

    state: newNode_14
        a: Отчаяние это очень печально. Главное помните:
        # Transition /newNode_15
        go!: /newNode_44

    state: newNode_24
        a: Банки сегодня с вольностью раздают кредиты всем желающим без какой-либо проверки платежеспособности заемщика. В России работает несколько тысяч крупных и не очень банков и несколько сотен заемных контор («Быстро деньги», «Деньги сейчас» и др.).
        # Transition /newNode_25
        go!: /newNode_26

    state: newNode_56
        a:  Прочитай кредитный договор\n
            В любой непонятной ситуации первым делом смотри кредитный договор. Там написано, что тебя ждёт за задержку платежей и что — за систематическую неуплату.\n
            Найди раздел договора, в котором описано, в каких случаях и как банк может забрать квартиру за долги.  Это нужно, чтобы подготовиться к переговорам.
        # Transition /newNode_57
        go!: /newNode_62

    state: newNode_58
        a:  Что будет, если не выплачивать ипотеку и скрываться от банка\n
            Многим психологически сложно признаться, что денег на выплату кредита нет, и когда они будут — неизвестно. Иногда люди начинают скрываться от банка не из-за того, что они «злостные неплательщики», а просто от растерянности. И тогда события развиваются по самому негативному сценарию.
        # Transition /newNode_59
        go!: /newNode_56

    state: newNode_60
        a: Отчаяние это очень печально. Главное помни:
        # Transition /newNode_72
        go!: /newNode_63

    state: newNode_61
        a: Банки сегодня с вольностью раздают кредиты всем желающим без какой-либо проверки платежеспособности заемщика. В России работает несколько тысяч крупных и не очень банков и несколько сотен заемных контор («Быстро деньги», «Деньги сейчас» и др.).
        # Transition /newNode_77
        go!: /newNode_65

    state: newNode_33
        a: Если у вас просто изменились дни выплаты зарплаты, с которой вы платили взносы, и вам стало неудобно платить в какие-то определённые даты, банк почти наверняка пойдёт вам навстречу и переделает график платежей.
        # Transition /newNode_75
        go!: /newNode_5

    state: newNode_44
        CardList:
            actions = [{"buttons":[{"name":"Назад","transition":"/newNode_5"},{"name":"Главное меню","transition":"/newNode_5"},{"name":"Любая истина парадоксально","transition":"/newNode_17"},{"name":"Правило перезагрузки","transition":"/newNode_18"},{"name":"Ищи внутри","transition":"/newNode_19"}],"type":"buttons"}]
            listTitle = Помни что:
            listItems = [{"title":"Любая истина парадоксальна","value":"","subtitle":"","iconUrl":"http://some-my-url/static/77c17a3ac8a4cbfb10000a39522058da","hash":"b1109ddc890852b94ea4ffa4fdd1004d","action":{"name":"Любая истина парадоксальна","then":"/newNode_17"}},{"title":"Правило перезагрузки","value":"","subtitle":"","iconUrl":"http://some-my-url/static/809a7702f08e5e73d51562a7d072389a","hash":"a07c436eeb7392ce655336dd4d458cbb","action":{"name":"Правило перезагрузки","then":"/newNode_18"}},{"title":"Ищи внутри","value":"","subtitle":"","iconUrl":"http://some-my-url/static/34e0c0037754c48e5a469aae5fcf5be6","hash":"8d0644290fd102a6008936d53c9e562e","action":{"name":"Ищи внутри","then":"/newNode_19"}}]
            button = {"name":"","transition":"","enabled":false}

    state: newNode_11
        a: Признайте важность проблемы. Выражается депрессия в первую очередь в постоянном подавленном состоянии, хронической усталости и потере интереса к вещам, которые раньше радовали.
        # Transition /newNode_12
        go!: /newNode_13

    state: newNode_26
        a: Письменно под роспись или заказным письмом с уведомлением сообщаем в банковскую организацию о том, что у Вас изменилась жизненная ситуация в худшую сторону и теперь Вы не сможете платить банку установленные в графике платежи. Если филиал банка находится в вашем городе, письмо лучше завести под роспись, если другой город – отправить почтой заказным письмом. Тем самым Вы уведомили кредитора о том, по какой причине вы допустили просрочку по договору.
        # Transition /newNode_27
        go!: /newNode_28

    state: newNode_62
        a: Если у тебя просто изменились дни выплаты зарплаты, с которой тебе платили взносы, и тебе стало неудобно платить в какие-то определённые даты, банк почти наверняка пойдёт тебе навстречу и переделает график платежей.
        # Transition /newNode_76
        go!: /newNode_50

    state: newNode_63
        CardList:
            actions = [{"buttons":[{"name":"Назад","transition":"/newNode_54"},{"name":"Главное меню","transition":"/newNode_50"},{"name":"Любая истина парадоксальна","transition":"/newNode_66"},{"name":"Правило перезагрузки","transition":"/newNode_70"},{"name":"Ищи внутри","transition":"/newNode_69"}],"type":"buttons"}]
            listTitle = Помни что:
            listItems = [{"title":"Любая истина парадоксальна","value":"","subtitle":"","iconUrl":"http://some-my-url/static/e1eb671b5ded759dae57fb76c1aeeb58","hash":"e1eb671b5ded759dae57fb76c1aeeb58","action":{"name":"Любая истина парадоксальна","then":"/newNode_66"}},{"title":"Правило перезагрузки","value":"","subtitle":"","iconUrl":"http://some-my-url/static/809a7702f08e5e73d51562a7d072389a","hash":"809a7702f08e5e73d51562a7d072389a","action":{"name":"Правило перезагрузки","then":"/newNode_70"}},{"title":"Ищи внутри","value":"","subtitle":"","iconUrl":"http://some-my-url/static/34e0c0037754c48e5a469aae5fcf5be6","hash":"34e0c0037754c48e5a469aae5fcf5be6","action":{"name":"Ищи внутри","then":"/newNode_69"}}]
            button = {"name":"","transition":"","enabled":false}

    state: newNode_64
        a: Признай важность проблемы. Выражается депрессия в первую очередь в постоянном подавленном состоянии, хронической усталости и потере интереса к вещам, которые раньше радовали.
        # Transition /newNode_82
        go!: /newNode_71

    state: newNode_65
        a: Письменно под роспись или заказным письмом с уведомлением сообщаем в банковскую организацию о том, что у тебя изменилась жизненная ситуация в худшую сторону и теперь ты не сможешь платить банку установленные в графике платежи. Если филиал банка находится в вашем городе, письмо лучше завести под роспись, если другой город – отправить почтой заказным письмом. Тем самым ты уведомил кредитора о том, по какой причине ты допустил просрочку по договору.
        # Transition /newNode_78
        go!: /newNode_67

    state: newNode_17
        a: Первая и самая достоверная истина: любая истина парадоксальна. Жизнь — это драгоценный, неизмеримо прекрасный подарок и в то же время невыносимое наказание. Сквернейшее сочетание для обладателей чувствительной души. В этом мире столько тягот и странностей, что иной раз задумаешься: не розыгрыш ли все это? Здесь переплетены душераздирающая красота и доброта, ужасная бедность, потопы и младенцы, прыщи и музыка Моцарта. Система не самая идеальная.
        # Transition /newNode_38
        go!: /newNode_44

    state: newNode_28
        a: Если у Вас не было цели брать невозвратный кредит и Вы сделали хотя бы один платеж - к уголовной ответственности за кредитные долги Вас не привлекут.
        # Transition /newNode_39
        go!: /newNode_5

    state: newNode_21
        a: Люди, страдающие депрессией, не просто чувствуют себя одиноко — они часто испытывают стыд и вину за свои чувства и эмоции. Из страха быть непонятыми, высмеянными или отвергнутыми они предпочитают молчать о своих переживаниях, не обращаются за помощью или отказываются признавать серьезность своего положения.
        # Transition /newNode_36
        go!: /newNode_5

    state: newNode_19
        a: Почти все, что может сделать вас счастливым надолго, можно отыскать только внутри себя. Исключение: вы в очереди на донорский орган. Невозможно купить или заслужить умиротворение, нельзя пригласить на свидание здоровую самооценку. Это самая отвратительная истина, лично меня она возмущает. Но все важное действительно достигается внутренней работой, и мы не можем проделать ее за других, как бы сильно мы их ни любили.
        # Transition /newNode_34
        go!: /newNode_44

    state: newNode_18
        a: Практически любая вещь исправно заработает снова, если выключить ее на несколько минут. И к вам это тоже относится.
        # Transition /newNode_37
        go!: /newNode_44

    state: newNode_13
        a: Депрессия может вести и к полной утрате интереса к жизни, суицидальному состоянию и самоубийству. Диагноз ставят, если длительность симптомов составляет не менее двух недель — но депрессия может длиться месяцами, а то и годами, и ее необходимо лечить.
        # Transition /newNode_20
        go!: /newNode_21

    state: newNode_66
        a: Первая и самая достоверная истина: любая истина парадоксальна. Жизнь — это драгоценный, неизмеримо прекрасный подарок и в то же время невыносимое наказание. Сквернейшее сочетание для обладателей чувствительной души. В этом мире столько тягот и странностей, что иной раз задумаешься: не розыгрыш ли все это? Здесь переплетены душераздирающая красота и доброта, ужасная бедность, потопы и младенцы, прыщи и музыка Моцарта. Система не самая идеальная.
        # Transition /newNode_80
        go!: /newNode_63

    state: newNode_67
        a: Если у тебя не было цели брать невозвратный кредит и ты сделал хотя бы один платеж - к уголовной ответственности за кредитные долги тебя не привлекут.
        # Transition /newNode_79
        go!: /newNode_50

    state: newNode_68
        a: Люди, страдающие депрессией, не просто чувствуют себя одиноко — они часто испытывают стыд и вину за свои чувства и эмоции. Из страха быть непонятыми, высмеянными или отвергнутыми они предпочитают молчать о своих переживаниях, не обращаются за помощью или отказываются признавать серьезность своего положения.
        # Transition /newNode_81
        go!: /newNode_50

    state: newNode_69
        a: Почти все, что может сделать вас счастливым надолго, можно отыскать только внутри себя. Исключение: вы в очереди на донорский орган. Невозможно купить или заслужить умиротворение, нельзя пригласить на свидание здоровую самооценку. Это самая отвратительная истина, лично меня она возмущает. Но все важное действительно достигается внутренней работой, и мы не можем проделать ее за других, как бы сильно мы их ни любили.
        # Transition /newNode_84
        go!: /newNode_63

    state: newNode_70
        a: Практически любая вещь исправно заработает снова, если выключить ее на несколько минут. И к вам это тоже относится.
        # Transition /newNode_85
        go!: /newNode_63

    state: newNode_71
        a: Депрессия может вести и к полной утрате интереса к жизни, суицидальному состоянию и самоубийству. Диагноз ставят, если длительность симптомов составляет не менее двух недель — но депрессия может длиться месяцами, а то и годами, и ее необходимо лечить.
        # Transition /newNode_83
        go!: /newNode_50