import csv
import pytils

with open('test.csv', encoding='utf-8') as csv_file:
    csv_reader = csv.reader(csv_file, delimiter=',')
    for row in csv_reader:
        print(f'\t{pytils.translit.slugify(row[0])} is the city')
        filename = "concept_" + pytils.translit.slugify(row[0]) + ".scs"
        file = open(filename, "w+", encoding='utf-8')

        file.write(f"""concept_{pytils.translit.slugify(row[0])}
        =>nrel_main_idtf:
        [{row[0]}](*<-lang_ru;;*);
        [{pytils.translit.slugify(row[0])}](*<-lang_en;;*);
        <- rrel_key_sc_element:
        desc_of_concept_{pytils.translit.slugify(row[0])}
        (*
        => nrel_main_idtf:
        [Описание города "{row[0]}"](*<-lang_ru;;*);
        [Description of city "{pytils.translit.slugify(row[0])}"](*<-lang_en;;*);;
        <- sc_definition;;
        <= nrel_sc_text_translation:
        ...(*
        -> rrel_example:
        [Город {row[0]} находится в стране {row[1]}. Площадь города: {row[2]}, высота над уровнем моря: {row[3]}. Тип климата: {row[4]}. Часовой пояс: {row[5]}, количество жителей: {row[6]}. Автомобильный код: {row[8]}, телефонный код: {row[9]}.](*<-lang_ru;;*);;
        *);;
        *);
        <-sc_node_not_relation;""")
        file.close()
